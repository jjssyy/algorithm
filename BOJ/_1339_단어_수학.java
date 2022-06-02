import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1339_단어_수학 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[26];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			int length = str.length();
			int tmp = 1;
			for(int j=length-1; j>=0; j--) {
				arr[str.charAt(j)-'A'] += tmp;
				tmp*=10;
			}
		}
		
		Arrays.sort(arr);
		
		int num = 9;
		int ans = 0;
		for(int i=25; i>=0; i--) {
			if(arr[i]==0) break;
			
			ans+= arr[i]*num;
			num--;
		}
		System.out.println(ans);
	}
}
