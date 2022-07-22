public class _lv1_x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        int x = -4;
        int n = 2;
        solution(x, n);
    }
    static public long[] solution(int x, int n) {
        long[] answer = new long[n];

        answer[0] = x;
        
        for(int i=1; i<n; i++){
            answer[i] = answer[i-1]+x;
        }

        return answer;
    }
}
