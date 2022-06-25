import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809_알파벳_찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        int[] arr = new int[26];
        for(int i=0; i<26; i++){
            arr[i] = -1;
        }
        for(int i=0; i<S.length(); i++){
            if(arr[S.charAt(i)-'a']==-1){
                arr[S.charAt(i)-'a']=i;
            }
        }
        for(int i=0; i<26; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
