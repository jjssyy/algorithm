public class _lv1_짝수와_홀수 {
    public static void main(String[] args) {
        int num = 3;
        solution(num);
    }
    static public String solution(int num) {
        String answer = "";
        if(num%2 ==0){
            answer = "Even";
        }else{
            answer = "Odd";
        }

        System.out.println(answer);
        return answer;
    }
}
