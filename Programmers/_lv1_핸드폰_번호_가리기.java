public class _lv1_핸드폰_번호_가리기 {
    public static void main(String[] args) {
        String phone_number = "027778888";
        solution(phone_number);
    }
    static public String solution(String phone_number) {
        String answer = "";

        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<phone_number.length()-4; i++){
            sb.append("*");
        }
        for(int i=phone_number.length()-4; i<phone_number.length(); i++){
            sb.append(phone_number.charAt(i));
        }

        answer = sb.toString();
        System.out.println(answer);
        return answer;
    }
}
