import java.util.Scanner;

public class _1309_동물원 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] dp = new int[N][3];
		
		dp[0][0] = 1;
		dp[0][1] = 1;
		dp[0][2] = 1;
		
		for(int i=1; i<N; i++) {
			dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2])%9901;
			dp[i][1] = (dp[i-1][0] + dp[i-1][2])%9901;
			dp[i][2] = (dp[i-1][0] + dp[i-1][1])%9901;
		}
		
		sc.close();

		int ans = (dp[N-1][0] + dp[N-1][1] + dp[N-1][2])%9901;
		System.out.println(ans);
	}
}
