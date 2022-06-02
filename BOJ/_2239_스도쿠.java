import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2239_스도쿠 {
	
	static int[][] board;
	static int cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		board = new int[9][9];
		for(int i=0;i<9;i++) {
			String[] s = br.readLine().split("");
			for(int j=0;j<9;j++) {
				board[i][j] = Integer.parseInt(s[j]);
			}
		}
		solve(0,0);
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
	}

	static boolean solve(int x, int y) {
		if(x==9) {
			return true;
		}
		if(y==9) {
			return solve(x+1,0);
		}
		
		if(board[x][y]!=0) {
			return solve(x,y+1);
		}
		
		for(int i=1;i<=9;i++) {
			if(check(x,y,i)) {
				board[x][y]=i;
				if(solve(x,y+1)) return true;
				board[x][y]=0;
			}
		}
		return false;
	}
	
	static boolean check(int x, int y, int num) {
		
		//행검사
		for(int i=0;i<9;i++) {
			if(board[x][i] == num) return false;
		}
		
		//열검사
		for(int i=0;i<9;i++) {
			if(board[i][y]==num) return false;
		}
		
		int tx = (x/3)*3;
		int ty = (y/3)*3;
		
		//3x3검사
		for(int i=tx;i<tx+3;i++) {
			for(int j =ty; j<ty+3;j++) {
				if(board[i][j]==num) return false;
			}
		}
		
		return true;
	}

}
