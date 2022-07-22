public class _lv1_두_정수_사이의_합 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        solution(a, b);
    }
    static public long solution(int a, int b) {
        long answer = 0;

        int n = Math.min(a, b);
        int m = Math.max(a, b);

        for(int i=n; i<=m; i++){
            answer += i;
        }
        System.out.println(answer);
        return answer;
    }
}
