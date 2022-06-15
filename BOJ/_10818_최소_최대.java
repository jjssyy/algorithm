import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10818_최소_최대 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp>max){
                max = tmp;
            }
            if(tmp<min){
                min = tmp;
            }
        }
        System.out.println(min+" "+max);
    }
}
