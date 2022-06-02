import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class _1715_카드_정렬하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<N; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		int ans = 0;
		while(pq.size()>1) {
			int a = pq.poll();
			int b = pq.poll();
			
			ans+=(a+b);
			pq.add(a+b);
		}
		System.out.println(ans);
	}
}
