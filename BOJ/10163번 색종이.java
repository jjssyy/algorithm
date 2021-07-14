import java.io.*;
import java.util.*;

public class _10163_색종이 {
	
	static int N;
	static int[][] arr;
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		arr = new int[101][101];
		
		for(int tc=1;tc<=N;tc++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			for(int i=x;i<x+w;i++) {
				for(int j=y;j<y+h;j++) {
					arr[i][j]=tc;
				}
			}
		}
		for(int k=1;k<=N;k++) {
			int ans =0;
			for(int i=0;i<101;i++) {
				for(int j=0;j<101;j++) {
					if(arr[i][j]==k)
						ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
