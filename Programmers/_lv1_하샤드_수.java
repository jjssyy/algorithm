public class _lv1_하샤드_수 {
    public static void main(String[] args) {
        int x =10;
        solution(x);
    }
    static public boolean solution(int x) {
        boolean answer = true;
        int sum =0;
        int n = x;
        while(n>0){
            sum += n%10;
            n = n/10;
        }

        if(x%sum != 0){
            answer = false;
        }
        
        System.out.println(answer);
        return answer;
    }
}
