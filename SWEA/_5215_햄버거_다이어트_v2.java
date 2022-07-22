import java.io.*;
import java.util.*;

public class _5215_햄버거_다이어트_v2 {
    static int N, L, ans;
    static int[] cal, score;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int tc=1; tc<=T; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());

            score = new int[N];
            cal = new int[N];

            for(int i=0; i<N; i++){
                st = new StringTokenizer(br.readLine());
                score[i] = Integer.parseInt(st.nextToken());
                cal[i] = Integer.parseInt(st.nextToken());
            }

            solve(0,0,0);

            System.out.println("#"+tc+" "+ans);
            ans =0;
        }
    }

    static void solve(int idx, int sum_taste, int sum_cal){
        if(sum_cal>L){
            return;
        }
        if(idx==N){
            ans = Math.max(ans, sum_taste);
            return;
        }

        solve(idx+1, sum_taste+score[idx], sum_cal+cal[idx]); //선택
        solve(idx+1, sum_taste, sum_cal); //선택X
    }
}
