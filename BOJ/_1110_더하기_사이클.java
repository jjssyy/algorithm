import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1110_더하기_사이클 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt=0;
        
        int tmp=N;

        while(true){
            tmp = (tmp%10)*10 + (tmp/10+tmp%10)%10;
            cnt++;
            if(tmp==N){
                break;
            }
        }
        System.out.println(cnt);
    }
}
