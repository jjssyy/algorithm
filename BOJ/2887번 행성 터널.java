import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _2887_행성_터널 {
	static class Node{
		int idx;
		int x;
		int y;
		int z;
		
		public Node(int idx, int x, int y, int z) {
			super();
			this.idx = idx;
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
	static class Edge implements Comparable<Edge>{
		int start;
		int end;
		int weight;
		
		public Edge(int start, int end, int weight) {
			super();
			this.start = start;
			this.end = end;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge o) {
			return this.weight - o.weight;
		}
	}
	static int find(int a) {
		if(parents[a]==a) {
			return a;
		}
		return parents[a] = find(parents[a]);
	}
	static boolean union(int a, int b) {
		int aRoot = find(a);
		int bRoot = find(b);
		
		if(aRoot==bRoot) {
			return false;
		}
		parents[bRoot] = aRoot;
		return true;
	}
	static int[] parents;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Node[] node = new Node[N];
		parents = new int[N];
		for(int i=0; i<N; i++) {
			parents[i] = i;
		}
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			
			node[i] = new Node(i, x, y, z);
		}
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		
		Arrays.sort(node, new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				return o1.x - o2.x;
			}
		});
		for(int i=0; i<N-1; i++) {
			int weight = Math.abs(node[i].x - node[i+1].x);
			pq.add(new Edge(node[i].idx, node[i+1].idx, weight));
		}
		
		Arrays.sort(node, (n1, n2)->n1.y-n2.y);
		for(int i=0; i<N-1; i++) {
			int weight = Math.abs(node[i].y - node[i+1].y);
			pq.add(new Edge(node[i].idx, node[i+1].idx, weight));
		}
		
		Arrays.sort(node, (n1, n2)->n1.z-n2.z);
		for(int i=0; i<N-1; i++) {
			int weight = Math.abs(node[i].z - node[i+1].z);
			pq.add(new Edge(node[i].idx, node[i+1].idx, weight));
		}
		int ans=0;
		int cnt=1;
		while(!pq.isEmpty()) {
			Edge cur = pq.poll();
			
			if(union(cur.start, cur.end)) {
				cnt++;
				ans+=cur.weight;
			}
			if(cnt==N) {
				break;
			}
		}
		System.out.println(ans);
	}
}
