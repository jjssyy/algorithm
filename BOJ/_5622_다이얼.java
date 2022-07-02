import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5622_다이얼 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int time =0;
        for(int i=0; i<str.length(); i++){
            int s = str.charAt(i)-'A';
            if(s<3){ //ABC
                time+=3;
            }else if(s<6){ //DEF
                time+=4;
            }else if(s<9){ //GHI
                time+=5;
            }else if(s<12){ //JKL
                time+=6;
            }else if(s<15){ //MNO
                time+=7;
            }else if(s<19){ //PQRS
                time+=8;
            }else if(s<22){ //TUV
                time+=9;
            }else{ //WXYZ
                time+=10;
            }
        }
        System.out.println(time);
    }
}
