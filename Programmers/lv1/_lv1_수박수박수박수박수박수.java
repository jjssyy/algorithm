public class _lv1_수박수박수박수박수박수 {
    public static void main(String[] args) {
        int n = 3;
        solution(n);
        n = 4;
        solution(n);
    }
    static public String solution(int n) {
        String answer = "";

        for(int i=0; i<n/2; i++){
            answer += "수박";
        }
        if(n%2 != 0){
            answer += "수";
        }
        System.out.println(answer);
        return answer;
    }
}
