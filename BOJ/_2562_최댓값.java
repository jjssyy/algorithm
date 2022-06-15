import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2562_최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max =0;
        int cnt =0;
        for(int i=1; i<=9; i++){
            int tmp = Integer.parseInt(br.readLine());
            if(tmp>max){
                max = tmp;
                cnt = i;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
    }
    
}
