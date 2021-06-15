import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _2457_공주님의_정원 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<flower> list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a1 = Integer.parseInt(st.nextToken());
			int a2 = Integer.parseInt(st.nextToken());
			int b1 = Integer.parseInt(st.nextToken());
			int b2 = Integer.parseInt(st.nextToken());
			
			list.add(new flower(a1*100+a2, b1*100+b2));
		}
		Collections.sort(list);
		
		int ans =0;
		int start =301;
		int idx =0;
		int max =0;
		while(start<1201) {
			max =0;
			boolean flag = false;
			for(int i=idx; i<N; i++) {
				flower cur = list.get(i);
				if(cur.start<=start && max<cur.end) {
					max = cur.end;
					idx=i+1;
					flag = true;
				}
			}
			if(flag) {
				start=max;
				ans++;
			}else {
				break;
			}
		}
		
		if(max<1201) {
			System.out.println(0);
		}else {
			System.out.println(ans);
		}
	}
	
	static class flower implements Comparable<flower>{
		int start;
		int end;
		
		public flower(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(flower o) {
			if(this.start == o.start) {
				return this.end - o.end;
			}
			return this.start - o.start;
		}
	}
}
