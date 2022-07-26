public class _lv1_없는_숫자_더하기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        solution(numbers);
    }
    static public int solution(int[] numbers) {
        int answer = 0;
        boolean[] check = new boolean[10];
        for(int i=0; i<numbers.length; i++){
            check[numbers[i]] = true;
        }

        for(int i=0; i<10; i++){
            if(!check[i]){
                answer+=i;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
