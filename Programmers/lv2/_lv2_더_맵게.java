import java.util.*;

public class _lv2_더_맵게 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        solution(scoville, K);
    }
    static public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : scoville){
            pq.offer(i);
        }
        int answer = 0;
        while(pq.peek()<K){
            if(pq.size()==1){
                return -1;
            }
            int a = pq.poll();
            int b = pq.poll();
            pq.offer(a+(b*2));
            answer++;
        }
        
        return answer;
    }
}
