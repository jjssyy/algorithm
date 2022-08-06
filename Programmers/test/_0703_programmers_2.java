import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _0703_programmers_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        // boolean horizontal = Boolean.valueOf(st.nextToken());
        boolean horizontal = true;
        
        int[][] answer = new int[n][n];
        answer[0][0] = 1;
        int r =0;
        int c =0;
        int cnt =2;
        out : while(cnt<=n*n){
            if(horizontal){
                c++;
                answer[r][c] = cnt;
                cnt++;
                
                for(int i=0; i<c; i++){
                    r++;
                    if(cnt>n*n){
                        break out;
                    }
                    answer[r][c] = cnt;
                    cnt++;
                }

                for(int i=r; i>0; i--){
                    c--;
                    answer[r][c] = cnt;
                    cnt++;
                }

                if(cnt>n*n){
                    break;
                }
                r++;
                answer[r][c] = cnt;
                cnt++;
                
                for(int i=0; i<r; i++){
                    c++;
                    answer[r][c] = cnt;
                    cnt++;
                }
                
                for(int i=c; i<0; i--){
                    r--;
                    answer[r][c] = cnt;
                    cnt++;
                }

            }else{
                break;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
    }
}
