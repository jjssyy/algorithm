import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class _1092_배 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> crane = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			crane.add(Integer.parseInt(st.nextToken()));
		}
		
		int M = Integer.parseInt(br.readLine());
		ArrayList<Integer> box = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<M; i++) {
			box.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(crane, Collections.reverseOrder());
		Collections.sort(box, Collections.reverseOrder());
		
		if(crane.get(0)<box.get(0)) {
			System.out.println("-1");
			return;
		}
		int cnt =0;
		while(!box.isEmpty()) {
			int idx = 0; // 박스 인덱스
			for(int i=0; i<crane.size();) {
				if(idx==box.size()) break;
				if(box.get(idx)<=crane.get(i)) {
					box.remove(idx);
					i++; //박스 인덱스만 증가시킬 경우 크레인 인덱스 증가시키면 안됨
				}else {
					idx++; 
				}
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
