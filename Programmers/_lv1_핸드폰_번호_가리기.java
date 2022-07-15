public class _lv1_핸드폰_번호_가리기 {
    public static void main(String[] args) {
        String phone_number = "027778888";
        solution(phone_number);
    }
    static public String solution(String phone_number) {
        String answer = "";
        
        for(int i=0; i<phone_number.length()-4; i++){
            answer += "*";
        }
        for(int i=phone_number.length()-4; i<phone_number.length(); i++){
            answer += phone_number.charAt(i);
        }

        System.out.println(answer);
        return answer;
    }
}
