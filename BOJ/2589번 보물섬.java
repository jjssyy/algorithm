import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2589_보물섬 {
	static int N, M, ans;
	static char[][] map;
	static boolean[][] visited;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new char[N][M];
		for(int i=0; i<N; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j]=='L') {
					visited = new boolean[N][M];
					bfs(i,j);
				}
			}
		}
		System.out.println(ans);
	}
	static void bfs(int r, int c) {
		Queue<Point> q = new LinkedList<>();
		visited[r][c] = true;
		q.offer(new Point(r,c,0));
		
		int cnt =0;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			cnt = Math.max(cnt, cur.cnt);
			
			for(int d=0; d<4; d++) {
				int nr = cur.r+dr[d];
				int nc = cur.c+dc[d];
				if(nr<0 || nc<0 || nr>=N || nc>=M || map[nr][nc]=='W') continue;
				if(visited[nr][nc]) continue;
				
				visited[nr][nc] = true;
				q.offer(new Point(nr, nc, cur.cnt+1));
			}
			
		}
		ans = Math.max(ans, cnt);
	}
	
	static class Point{
		int r;
		int c;
		int cnt;
		
		public Point(int r, int c, int cnt) {
			super();
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}
	}
}
