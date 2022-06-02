import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _13904_과제 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Node[] arr = new Node[N];
		
		int maxDay = 0;
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int day = Integer.parseInt(st.nextToken());
			int score = Integer.parseInt(st.nextToken());
			maxDay = Math.max(maxDay, day);
			arr[i] = new Node(score, day);
		}
		boolean[] check = new boolean[maxDay+1];
		Arrays.sort(arr);
		int ans =0;
		for(int i=0; i<N; i++) {
			int day = arr[i].day;
			int score = arr[i].score;
			
			for(int j=day; j>0; j--) {
				if(!check[j]) {
					check[j] = true;
					ans+=score;
					break;
				}
			}
		}
		System.out.println(ans);
	}
	static class Node implements Comparable<Node>{
		int day;
		int score;
		
		public Node(int day, int score) {
			super();
			this.day = day;
			this.score = score;
		}
		@Override
		public int compareTo(Node o) {
			if(o.score==this.score) {
				return o.day - this.day;
			}
			return o.score - this.score;
		}
	}
}
