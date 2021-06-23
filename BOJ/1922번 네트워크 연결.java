import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//최소 스패닝 트리(최소 신장 트리) - 크루스칼
public class _1922_네트워크_연결 {
	static int N, M;
	static int[] parents;
	static ArrayList<Node> list = new ArrayList<>();
	
	static void make() {
		for(int i=1; i<=N; i++) {
			parents[i] = i;
		}
	}

	static int findSet(int a) { //사이클 판단
		if(parents[a]==a) {
			return a;
		}
		return parents[a] = findSet(parents[a]);
	}
	
	static boolean union(int a, int b) {
		int aRoot = findSet(a);
		int bRoot = findSet(b);
		
		if(aRoot == bRoot) return false; //이미 연결되어있는 상태
		
		parents[bRoot] = aRoot; // b를 a에 합치기
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		parents = new int[N+1];
		
		for(int i=0; i<M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			list.add(new Node(from, to, cost));
		}
		
		Collections.sort(list);
		
		make();
		
		int ans=0;
		
		for(int i=0; i<M; i++) {
			Node cur = list.get(i);
			if(union(cur.from, cur.to)) {
				ans+=cur.cost;
			}
		}
		System.out.println(ans);
	}
	static class Node implements Comparable<Node>{
		int from;
		int to;
		int cost;
		
		public Node(int from, int to, int cost) {
			super();
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
		@Override
		public int compareTo(Node o) {
			return this.cost - o.cost;
		}
	}
}
