import java.util.*;

public class _lv2_게임_맵_최단거리 {
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static boolean[][] check;
    static int n, m;
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        solution(maps);
    }
    static public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        check = new boolean[n][m];
        int answer = bfs(0, 0, maps);
        System.out.println(answer);
        return answer;
    }
    static int bfs(int r, int c, int[][]maps){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(r, c, 1));
        check[r][c] = true;
        
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.r==n-1 && node.c==m-1){
                return node.cnt;
            }
            
            for(int i=0; i<4; i++){
                int nr = node.r + dr[i];
                int nc = node.c + dc[i];
                
                if(nr>=0 && nc>=0 && nr<n && nc<m){
                    if(!check[nr][nc] && maps[nr][nc]==1){
                        check[nr][nc] = true;
                        q.offer(new Node(nr, nc, node.cnt+1));
                    }
                }
            }
        }
        return -1;
    }
    
    static public class Node{
        int r;
        int c;
        int cnt;
        
        public Node(int r, int c, int cnt){
            this.r = r;
            this.c = c;
            this.cnt = cnt;
        }
    }
}
