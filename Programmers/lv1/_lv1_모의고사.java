import java.util.*;

public class _lv1_모의고사 {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        solution(answers);
    }
    static public int[] solution(int[] answers) {
        int[] user1 = {1,2,3,4,5};
        int[] user2 = {2,1,2,3,2,4,2,5};
        int[] user3 = {3,3,1,1,2,2,4,4,5,5};
        
        int ans1 = 0;
        int ans2 = 0;
        int ans3 = 0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == user1[i%5]) ans1++;
            if(answers[i] == user2[i%8]) ans2++;
            if(answers[i] == user3[i%10]) ans3++;
        }
        int max = Math.max(ans1, Math.max(ans2, ans3));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(ans1 == max) list.add(1);
        if(ans2 == max) list.add(2);
        if(ans3 == max) list.add(3);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
