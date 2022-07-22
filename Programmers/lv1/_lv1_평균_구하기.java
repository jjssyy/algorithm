public class _lv1_평균_구하기 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        solution(arr);
    }
    static public double solution(int[] arr) {
        double answer = 0;
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        answer /= arr.length;
        System.out.println(answer);
        return answer;
    }
}
