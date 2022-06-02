import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _1781_컵라면 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Node> list = new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int deadline = Integer.parseInt(st.nextToken());
			int ramen = Integer.parseInt(st.nextToken());
			
			list.add(new Node(deadline, ramen));
		}
		Collections.sort(list);
		for(int i=0; i<N; i++) {
			int deadline = list.get(i).deadline;
			int ramen = list.get(i).ramen;
			
			if(pq.size()==deadline) {
				ramen = Math.max(ramen, pq.poll());
			}
			pq.add(ramen);
		}
		
		int ans =0;
		while(!pq.isEmpty()) {
			ans += pq.poll();
		}
		System.out.println(ans);
	}
	static class Node implements Comparable<Node>{
		int deadline;
		int ramen;
		
		public Node(int deadline, int ramen) {
			super();
			this.deadline = deadline;
			this.ramen = ramen;
		}
		@Override
		public int compareTo(Node o) {
			return this.deadline-o.deadline;
		}
	}
}
