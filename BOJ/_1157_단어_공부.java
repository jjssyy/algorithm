import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1157_단어_공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        int[] arr = new int[26];

        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)-'A']++;
        }

        int max =0;

        char ans = '?';
        for(int i=0; i<26; i++){
            if(max<arr[i]){
                max = arr[i];
                ans = (char) (i+'A');
            }else if(max==arr[i]){
                ans='?';
            }
        }
        System.out.println(ans);
    }
}
