import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _1546_평균 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Float> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            list.add(Float.parseFloat(st.nextToken()));
        }
        
        Collections.sort(list, Collections.reverseOrder());

        float sum=0;
        for(float i : list){
            sum += i/list.get(0)*100;
        }
        System.out.println(sum/N);
    }
}
