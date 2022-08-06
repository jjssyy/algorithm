import java.util.*;

public class _0806_2_ {
    public static void main(String[] args) {
        int[] levels = {1,2,3,4};
        solution(levels);
    }
    static public int solution(int[] levels) {
        int answer = 0;
        int sum =0;
        Arrays.sort(levels);

        for(int i=0; i<levels.length; i++){
            sum+=levels[i];
        }
        double standard = sum*0.25;
        ArrayList<Integer> list = new ArrayList<>();

        double s=0;
        for(int i=levels.length-1; i>=0; i--){
            
            if(sum/levels[i]+sum%levels[i]*0.1+s<=standard){
                s+=sum/levels[i]+sum%levels[i]*0.1;
                list.add(levels[i]);
            }
        }
        Collections.sort(list);
        answer = list.get(0);
        return answer;
    }
}
