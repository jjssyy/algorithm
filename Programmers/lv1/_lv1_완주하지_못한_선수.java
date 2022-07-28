import java.util.*;

public class _lv1_완주하지_못한_선수 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        solution(participant, completion);
    }
    static public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> hash = new HashMap<>();
        for(String s : participant){
            hash.put(s, hash.getOrDefault(s, 0)+1);
        }
        for(String s : completion){
            hash.put(s, hash.get(s)-1);
        }
        for (String s : hash.keySet()) {
            if (hash.get(s) != 0){
                answer = s;
            }
        }
        return answer;
    }
}
