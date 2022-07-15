public class _lv1_행렬의_덧셈 {
    public static void main(String[] args) {
        int[][] arr1 = {{1},{2}};
        int[][] arr2 = {{3},{4}};
        solution(arr1, arr2);
    }
    static public int[][] solution(int[][] arr1, int[][] arr2) {
        // int[][] answer = new int[arr1.length][arr1[0].length];
        int[][] answer ={};
        answer = arr1;

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                answer[i][j] += arr2[i][j];
            }
        }
        
        return answer;
    }
}
