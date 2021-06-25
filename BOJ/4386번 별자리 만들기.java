import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//최소 스패닝 트리(최소 신장 트리) - 프림
public class _4386_별자리_만들기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		double[][] stars = new double[N][2];
		double[][] graph = new double[N][N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			stars[i][0] = Double.parseDouble(st.nextToken()); //x
			stars[i][1] = Double.parseDouble(st.nextToken()); //y
			
			for(int j=0; j<i; j++) {
				double x1 = stars[i][0];
				double x2 = stars[j][0];
				
				double y1 = stars[i][1];
				double y2 = stars[j][1];
				
				double dist = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
				graph[i][j] = dist;
				graph[j][i] = dist;
			}
		}
		//가장 비용이 적은 간선을 선택하기 위해 우선순위 큐 사용
		//->poll()했을 때 우선순위 큐에 넣어진 간선들 중 가장 비용이 최소인 간선이 자동으로 선택되기 때문에
		//따로 반복문을 돌면서 그래프에 연결되지 않은 정점들 중 비용이 최소인 정점을 찾고 갱신할 필요 없음
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		//0번 별을 기준으로 다른 별들까지의 거리를 node객체로 만들어 pq에 넣기
		for(int i=1; i<N; i++) {
			pq.add(new Node(i, graph[0][i]));
		}
		int cnt =1;
		boolean[] visited = new boolean[N];
		double ans =0;
		visited[0] = true;
		
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			
			if(!visited[cur.idx]) {
				cnt++;
				ans+=cur.dist;
				visited[cur.idx] = true;
				
				if(cnt==N) break;
				
				for(int i=0; i<N; i++) {
					if(!visited[i]) {
						pq.add(new Node(i, graph[cur.idx][i]));
					}
				}
			}
		}
		System.out.printf("%.2f",ans);
		
	}
	static class Node implements Comparable<Node>{
		int idx;
		double dist;
		
		public Node(int idx, double dist) {
			super();
			this.idx = idx;
			this.dist = dist;
		}
		@Override
		public int compareTo(Node o) {
			return (int) (this.dist - o.dist);
		}
	}
}
