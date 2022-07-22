import java.util.Arrays;
import java.util.HashSet;

public class _lv1_두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        solution(numbers);
    }
    static public int[] solution(int[] numbers) {
        HashSet<Integer> hash = new HashSet<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                hash.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int[hash.size()];

        int idx =0;
        for(int i : hash){
            answer[idx] = i;
            idx++;
        }

        Arrays.sort(answer);

        return answer;
    }
}
