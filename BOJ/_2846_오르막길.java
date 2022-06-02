import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2846_오르막길 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int ans = 0;
		int sum = 0;
		//현재 값과 그 다음값의 차이를 계속 저장
		for(int i=0; i<N-1; i++) {
			if(arr[i]<arr[i+1]) {
				sum += arr[i+1]-arr[i];
			}else {
				sum=0;
			}
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
	}
}
