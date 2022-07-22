public class _lv1_2016년 {
    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        solution(a, b);
    }
    static public String solution(int a, int b) {
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int tmp = b;
        for(int i=0; i<a-1; i++){
            tmp += month[i];
        }

        if(tmp%7 ==0){
            return "THU";
        }
        String answer = day[tmp%7-1];

        return answer;
    }
}
