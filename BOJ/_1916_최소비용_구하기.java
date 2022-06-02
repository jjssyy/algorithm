import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _1916_최소비용_구하기 {
	static class Node implements Comparable<Node>{
		int idx;
		int cost;
		
		public Node(int idx, int cost) {
			super();
			this.idx = idx;
			this.cost = cost;
		}
		@Override
		public int compareTo(Node o) {
			return this.cost - o.cost;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		ArrayList<ArrayList<Node>> list = new ArrayList<>();
		for(int i=0; i<=N; i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=0; i<M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			list.get(start).add(new Node(end, cost));
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[] distance = new int[N+1];
		Arrays.fill(distance, Integer.MAX_VALUE);
		boolean[] check = new boolean[N+1];
		
		pq.add(new Node(start, 0));
		distance[start] = 0;
		
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			int idx = cur.idx;
			
			if(!check[idx]) {
				check[idx] = true;
				
				for (Node n : list.get(idx)) {
					if(!check[n.idx] && distance[n.idx]>distance[idx]+n.cost) {
						distance[n.idx] = distance[idx]+n.cost;
						pq.add(new Node(n.idx, distance[n.idx]));
					}
				}
			}
		}
		System.out.println(distance[end]);
	}
}
