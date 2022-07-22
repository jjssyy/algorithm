public class _lv2_타겟_넘버 {
    static int answer;
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        solution(numbers, target);
    }
    static public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(0,0,numbers, target);
        return answer;
    }
    static void dfs(int idx, int sum, int[] numbers, int target){
        if(idx==numbers.length){
            if(sum == target){
                answer++;
            }
            return;
        }
        dfs(idx+1, sum+numbers[idx], numbers, target);
        dfs(idx+1, sum-numbers[idx], numbers, target);
    }
}
