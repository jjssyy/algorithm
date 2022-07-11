import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1260_DFS와_BFS {
    static int N;
    static boolean[][] arr;
    static boolean[] check;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        arr = new boolean[N+1][N+1];
        check = new boolean[N+1];
        
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = true;
            arr[b][a] = true;
        }

        dfs(V);
        System.out.println();
        check = new boolean[N+1];
        bfs(V);
    }
    static void dfs(int V){
        check[V] = true;
        System.out.print(V+" ");

        for(int i=1; i<=N; i++){
            if(arr[V][i] && !check[i]){
                dfs(i);
            }
        }

    }
    static void bfs(int V){
        Queue<Integer> q = new LinkedList<>();
        q.offer(V);
        check[V] = true;
        while(!q.isEmpty()){
            int cur = q.poll();
            System.out.print(cur+" ");
            
            for(int i=1; i<=N; i++){
                if(arr[cur][i] && !check[i]){
                    q.offer(i);
                    check[i] = true; //여기서 true로 바꾸지 않으면 큐에 같은 수가 여러번 들어갈 수 있음
                }
            }
        }
    }
}
