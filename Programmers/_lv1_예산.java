import java.util.Arrays;

public class _lv1_예산 {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;
        solution(d, budget);
    }
    static public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for(int i=0; i<d.length; i++){
            budget -= d[i];
            if(budget<0){
                break;
            }
            answer++;
        }

        System.out.println(answer);
        return answer;
    }
}
