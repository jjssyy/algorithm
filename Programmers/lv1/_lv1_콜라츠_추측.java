public class _lv1_콜라츠_추측 {
    public static void main(String[] args) {
        long num = 626331;
        solution(num);
    }
    static public int solution(long num) {
        int cnt = 0;
        
        while(num!=1){
            if(cnt==500){
                cnt = -1;
                break;
            }
            if(num%2 == 0){
                num /=2;
            }else{
                num = num*3+1;
            }
            cnt++;
        }

        System.out.println(cnt);
        return cnt;
    }
}
