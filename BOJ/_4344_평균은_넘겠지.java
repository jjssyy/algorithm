import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4344_평균은_넘겠지 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int students = Integer.parseInt(st.nextToken());
            int arr[] = new int[students];

            float sum =0;
            for(int j=0; j<students; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum+=arr[j];
            }

            float avg = sum/students;

            float cnt=0;
            for(int j=0; j<students; j++){
                if(arr[j]>avg){
                    cnt++;
                }
            }

            System.out.println(String.format("%.3f", (cnt/students*100))+"%");
        }
    }
}
