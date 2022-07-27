public class _lv1_음양_더하기 {
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        solution(absolutes, signs);
    }
    static public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<absolutes.length; i++){
            if(signs[i]){
                answer+=absolutes[i];
            }else{
                answer-=absolutes[i];
            }
        }
        return answer;
    }
}
