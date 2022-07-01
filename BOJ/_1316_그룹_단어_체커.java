import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1316_그룹_단어_체커 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt =0;
        for(int i=0; i<N; i++){
            String s = br.readLine();
            boolean[] check = new boolean[26];
            boolean flag = true;
            check[s.charAt(0)-'a'] = true;
            for(int j=1; j<s.length(); j++){
                if(check[s.charAt(j)-'a']&&s.charAt(j)-'a'!=s.charAt(j-1)-'a'){
                    flag = false;
                    break;
                }
                check[s.charAt(j)-'a'] = true;
            }
            if(flag){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
