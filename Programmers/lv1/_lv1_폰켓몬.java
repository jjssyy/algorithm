import java.util.HashSet;

public class _lv1_폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        solution(nums);
    }
    // N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 
    // 그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.
    static public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hash.add(nums[i]);
        }

        if(nums.length/2 <= hash.size()){
            answer = nums.length/2;
        }else{
            answer = hash.size();
        }

        return answer;
    }
}
