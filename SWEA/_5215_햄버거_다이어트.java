import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5215_햄버거_다이어트 {
	static int N, L, ans;
	static int[][] arr;
	static boolean[] select;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			
			arr = new int[N][2];
			select = new boolean[N];
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken()); //맛
				arr[i][1] = Integer.parseInt(st.nextToken()); //칼로리
			}
			ans = 0; //tc마다 초기화
			dfs(0);
			System.out.println("#"+tc+" "+ans);
		}
	}
	static void dfs(int idx) {
		if(idx==N) {
			int taste = 0;
			int cal = 0;
			for(int i=0;i <N; i++) {
				if(select[i]) {
					taste += arr[i][0];
					cal += arr[i][1];
				}
			}
			if(cal<=L) {
				ans = Math.max(ans, taste);
			}
			return;
		}
		select[idx] = true;
		dfs(idx+1);
		
		select[idx] = false;
		dfs(idx+1);
	}
}
