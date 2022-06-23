import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2839_설탕_배달 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int five = N/5;

        switch(N%5){
            case 0:
                System.out.println(five);
                break;
            case 1:
                if(five-1<0){
                    System.out.println(-1);
                }else{
                    System.out.println(five+1); //(5kg 개수 -1) + (3kg 개수 +2)
                }
                break;
            
            case 2:
                if(five-2<0){
                    System.out.println(-1);
                }else{
                    System.out.println(five+2); //(5kg 개수 -2) + (3kg 개수 +4)
                }
                break;
            
            case 3:
                System.out.println(five+1);
                break;
            
            case 4:
                if(five-1<0){
                    System.out.println(-1);
                }else{
                    System.out.println(five+2); //(5kg 개수 -1) + (3kg 개수 +3)
                }
                break;
            
        }
    }
}
