public class _lv3_네트워크 {
    static boolean[] check;
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        solution(n, computers);
    }
    public static int solution(int n, int[][] computers) {
        check = new boolean[n];        
        int answer = 0;
        
        for(int i=0; i<n; i++){
            if(!check[i]){
                dfs(i, computers, check);
                answer++;
            }
        }
        
        return answer;
    }
    static void dfs(int node, int[][] computers, boolean[] check){
        check[node] = true;
        
        for(int i=0; i<computers.length; i++){
            if(!check[i] && computers[node][i]==1){
                dfs(i, computers, check);
            }
        }
    }
}
