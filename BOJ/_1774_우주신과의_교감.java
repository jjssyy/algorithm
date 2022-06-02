import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _1774_우주신과의_교감 {
	static class Point{
		int idx;
		int x;
		int y;
		
		public Point(int idx, int x, int y) {
			super();
			this.idx = idx;
			this.x = x;
			this.y = y;
		}
	}
	static class Edge implements Comparable<Edge>{
		int start;
		int end;
		double dist;
		
		public Edge(int start, int end, double dist) {
			super();
			this.start = start;
			this.end = end;
			this.dist = dist;
		}

		@Override
		public int compareTo(Edge o) {
			return Double.compare(this.dist, o.dist);
		}
	}
	static int findSet(int a) {
		if(parent[a]==a) {
			return a;
		}
		return parent[a] = findSet(parent[a]);
	}
	static boolean union(int a, int b) {
		int aRoot = findSet(a);
		int bRoot = findSet(b);
		
		if(aRoot==bRoot) return false;
		
		parent[bRoot] = aRoot;
		return true;
	}
	static double getDistance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2));
	}
	static int[] parent;
	static ArrayList<Edge> list = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //정점
		int M = Integer.parseInt(st.nextToken()); //간선
		
		Point[] point = new Point[N+1];
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			point[i] = new Point(i,x,y);
		}
		parent = new int[N+1];
		for(int i=1; i<=N; i++) {
			parent[i] = i;
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			union(start, end);
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=i+1; j<=N; j++) {
				double dist = getDistance(point[i], point[j]);
				
				list.add(new Edge(i, j, dist));
			}
		}
		
		Collections.sort(list);
		
		double ans =0;
		
		for(int i=0; i<list.size(); i++) {
			Edge cur = list.get(i);
			
			if(union(cur.start, cur.end)) {
				ans+=cur.dist;
			}
		}
		System.out.printf("%.2f",ans);
	}
}
