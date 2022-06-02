import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _1461_도서관 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> positive = new ArrayList<>();
		ArrayList<Integer> negative = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			if(tmp>0) {
				positive.add(tmp);
			}else {
				negative.add(Math.abs(tmp));
			}
		}
		Collections.sort(positive, Collections.reverseOrder());
		Collections.sort(negative, Collections.reverseOrder());
		
		int max =0;
		if(positive.size()==0) {
			max = negative.get(0);
		}else if(negative.size()==0) {
			max = positive.get(0);
		}else {			
			max = Math.max(positive.get(0), negative.get(0));
		}

		int ans =0;		
		for(int i=0; i<positive.size(); i+=M) {
			ans+=positive.get(i)*2;
		}
		for(int i=0; i<negative.size(); i+=M) {
			ans+=negative.get(i)*2;
		}
		ans-=max;
		System.out.println(ans);
	}
}
