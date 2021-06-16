import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _11000_강의실_배정 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Node> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			list.add(new Node(start, end));
		}
		Collections.sort(list);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(list.get(0).end);
		
		for(int i=1; i<N; i++) {
			if(pq.peek()<=list.get(i).start) {
				pq.poll();
			}
			pq.offer(list.get(i).end);
		}
		System.out.println(pq.size());
	}
	
	static class Node implements Comparable<Node>{
		int start;
		int end;
		
		public Node(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Node o) {
			if(this.start==o.start) {
				return this.end - o.end;
			}
			return this.start - o.start;
		}
		
	}
}
