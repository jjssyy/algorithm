import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2525_오븐_시계 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(br.readLine());

        M += time;

        if(M>=60){
            H += M/60;
            M %= 60;
        }

        if(H>=24){
            H %= 24;
        }

        System.out.println(H+" "+M);

    }
}
