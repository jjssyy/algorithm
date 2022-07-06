import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1012_유기농_배추 {
    static int M, N, K;
    static int[][] arr;
    static boolean[][] check;
    static int[] dr = {-1, 1, 0, 0}; //상 하 좌 우
    static int[] dc = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            arr = new int[N][M];
            check = new boolean[N][M];

            for(int j=0; j<K; j++){
                st = new StringTokenizer(br.readLine());
                int m = Integer.parseInt(st.nextToken());
                int n = Integer.parseInt(st.nextToken());
                arr[n][m] = 1;
            }

            int ans =0;
            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    if(arr[j][k]==1 && !check[j][k]){
                        dfs(j,k);
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }

    }

    static void dfs(int r, int c){
        check[r][c] = true;

        for(int i=0; i<4; i++){
            int nr = r+dr[i];
            int nc = c+dc[i];

            if(nr>=0 && nc>=0 && nr<N && nc<M){
                if(!check[nr][nc] && arr[nr][nc]==1){
                    dfs(nr,nc);
                }
            }
        }
    }
}
