import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _12904_A와_B {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		String T = br.readLine();
		
		ArrayList<Character> tlist = new ArrayList<>();
		for(int i=0; i<T.length(); i++) {
			tlist.add(T.charAt(i));
		}
		//T->S
		int idx = tlist.size()-1;
		while(tlist.size()>S.length()) {
			if(tlist.get(idx)=='A') {
				tlist.remove(idx);
			}else {
				tlist.remove(idx);
				Collections.reverse(tlist);
			}
			idx--;
		}
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i)!=tlist.get(i)) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
	}
}
