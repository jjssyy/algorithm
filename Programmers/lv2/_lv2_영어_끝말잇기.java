import java.util.HashSet;

public class _lv2_영어_끝말잇기 {
    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        solution(n, words);
    }
    static public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        HashSet<String> hash = new HashSet<>();
        hash.add(words[0]);

        int num = 2;
        int turn = 1;

        for(int i=1; i<words.length; i++){
            String s = words[i];
            if(hash.contains(s) || s.charAt(0) != words[i-1].charAt(words[i-1].length()-1)){
                answer[0] = num;
                answer[1] = turn;
                break;
            }
            hash.add(s);
            num++;
            if(num>n){
                num = 1;
                turn++;
            }
        }
        
        for(int i : answer){
            System.out.print(i+" ");
        }
        
        return answer;
    }
}
