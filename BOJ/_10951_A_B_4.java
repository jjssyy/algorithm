import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10951_A_B_4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while((str=br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(str);

            System.out.println(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
        }
    }
}
