import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2109_순회강연 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Node[] arr = new Node[N];
		
		int maxDay = 0;
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int pay = Integer.parseInt(st.nextToken());
			int day = Integer.parseInt(st.nextToken());
			maxDay = Math.max(maxDay, day);
			arr[i] = new Node(pay, day);
		}
		boolean[] check = new boolean[maxDay+1];
		Arrays.sort(arr);
		int ans =0;
		for(int i=0; i<N; i++) {
			int pay = arr[i].pay;
			int day = arr[i].day;
			
			for(int j=day; j>0; j--) {
				if(!check[j]) {
					check[j] = true;
					ans+=pay;
					break;
				}
			}
		}
		System.out.println(ans);
	}
	static class Node implements Comparable<Node>{
		int pay;
		int day;
		
		public Node(int pay, int day) {
			super();
			this.pay = pay;
			this.day = day;
		}
		@Override
		public int compareTo(Node o) {
			if(o.pay==this.pay) {
				return o.day - this.day; //어떻게 하든 상관없음
			}
			return o.pay - this.pay;
		}
	}
}
