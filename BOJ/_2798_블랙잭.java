import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2798_블랙잭 {
    static int N, M, result;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        result=0;
        boolean[] selected = new boolean[N];
        solve(0,0,selected,0);

        System.out.println(result);
    }

    static void solve(int idx, int cnt, boolean[] selected, int sum){
        if(sum>M){
            return;
        }
        if(cnt==3){
            result = Math.max(result, sum);
            return;
        }
        for(int i= idx; i<N; i++){
            selected[i] = true;
            solve(i+1, cnt+1, selected, sum+arr[i]);
            selected[i] = false;
        }
    }
}
