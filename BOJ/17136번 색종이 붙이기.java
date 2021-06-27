package _0219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _17136_색종이_붙이기 {
	
	static int ans;
	static int[] paper = {5,5,5,5,5};
	static int[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		arr = new int[10][10];
		for(int i=0;i<10;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<10;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		ans = Integer.MAX_VALUE;
		
		solve(0,0,0);
		
		if(ans == Integer.MAX_VALUE) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
		
	}
	
	static void solve(int x, int y, int cnt) {
		if(ans<=cnt) {
			return;
		}
		//줄바꿈
		if(y>9) {
			solve(x+1,0,cnt);
			return;
		}
		//탐색 끝
		if(x>9) {
			ans = Math.min(ans, cnt);
			return;
		}
		if(arr[x][y]==0) {
			solve(x,y+1,cnt);
			return;
		}
		//5x5부터 붙일 수 있는지 검사
		for(int k=5;k>=1;k--) {
			
			//범위 벗어나거나 색종이 다쓰면
			if(paper[k-1]==0||x+k>10||y+k>10) {
				continue;
			}
			boolean check = true;
			for(int i=0;i<k;i++) {
				for(int j=0;j<k;j++) {
					if(arr[x+i][y+j]==0) {
						check =false;
						break;
					}
				}
				if(!check) break;
			}
			if(!check) continue;
			
			//색종이 붙일 수 있으면 0으로 바꿔주기
			for(int i=0;i<k;i++) {
				for(int j=0;j<k;j++) {
					arr[x+i][y+j] = 0;
				}
			}
			cnt++;
			paper[k-1]--;
			
			solve(x,y+k,cnt);
			
			//색종이 원상복구
			for(int i=0;i<k;i++) {
				for(int j=0;j<k;j++) {
					arr[x+i][y+j] = 1;
				}
			}
			cnt--;
			paper[k-1]++;
		}
	}

}
