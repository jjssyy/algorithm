public class _lv1_문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        solution(s);
    }
    static boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int p = 0;
        int y = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='p'){
                p++;
            }else if(c=='y'){
                y++;
            }
        }

        if(p!=y){
            answer = false;
        }
        System.out.println(answer);
        return answer;
    }
}
