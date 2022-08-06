public class _0806_1_ {
    public static void main(String[] args) {
        String s ="12223";
        solution(s);
    }
    static public int solution(String s) {
        int answer = 0;
        int cnt=0;
        for(int i=2; i<s.length(); i++){
            if(s.charAt(i)== s.charAt(i-1) && s.charAt(i)==s.charAt(i-2)){
                answer = Math.max(answer, Integer.parseInt(s.substring(i-2, i+1)));
                cnt++;
            }
        }
        if(cnt==0){
            return -1;
        }
        return answer;
    }
}
