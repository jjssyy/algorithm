import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2577_숫자의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int arr[] = new int[10];

        int result = A*B*C;

        String tmp = Integer.toString(result);
        for(int i=0; i<tmp.length(); i++){
            arr[tmp.charAt(i)-'0']++;
            // arr[Character.getNumericValue(tmp.charAt(i))]++;
        }
        for(int i=0; i<10; i++){
            System.out.println(arr[i]);
        }
    }
}
