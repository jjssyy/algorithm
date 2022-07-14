import java.util.Arrays;

public class _lv1_로또의_최고_순위와_최저_순위 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        solution(lottos, win_nums);
    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int same = 0;
        int zero = 0;

        for(int i=0; i<6; i++){
            if(lottos[i]==0){
                zero++;
                continue;
            }
            for(int j=0; j<6; j++){
                if(lottos[i]==win_nums[j]){
                    same++;
                    break;
                }
            }
        }

        if(same+zero>0){
            answer[0] = 7-(same+zero);
        }else{
            answer[0] = 6;
        }

        if(same>0){
            answer[1] = 7-same;
        }else{
            answer[1] = 6;
        }
        System.out.println(answer[0]+" "+answer[1]);

        return answer;
    }
}
