import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10872_팩토리얼 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int ans =1;
        for(int i=N; i>0; i--){
            ans *= i;
        }
        System.out.println(ans);
    }
}
