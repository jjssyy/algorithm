import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _lv1_신고_결과_받기 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report ={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        solution(id_list, report, k);
    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        //신고한 사람을 기준으로 하면 신고당한 사람마다 일일히 체크해서 신고 몇번 당했는지 카운트해야됨
        //-> 신고당한 사람을 기준으로 리스트업
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> answerMap = new HashMap<>();

        //hashmap 초기화
        for(int i=0; i<id_list.length; i++){
            HashSet<String> hash = new HashSet<>();
            reportMap.put(id_list[i], hash);
            answerMap.put(id_list[i], 0);
        }

        for(String s : report){
            StringTokenizer st = new StringTokenizer(s);
            String reporter = st.nextToken();
            String reportee = st.nextToken();

            reportMap.get(reportee).add(reporter);
            // HashSet<String> hash = reportMap.getOrDefault(reportee, null);
            // if(hash == null){
            //     hash = new HashSet<>();
            // }
            // hash.add(reporter);
            // reportMap.put(reportee, hash);
            
        }
        
        // System.out.println(reportMap);

        //메일 보내기
        for(String reportee : reportMap.keySet()){
            if(reportMap.get(reportee).size()>=k){
                for(String reporter : reportMap.get(reportee)){
                    answerMap.put(reporter, answerMap.get(reporter)+1);
                }
            }
        }

        for(int i=0; i<id_list.length; i++){
            answer[i] = answerMap.get(id_list[i]);
        }

        // System.out.println(answerMap);
        // for(int i=0; i<id_list.length; i++){
        //     System.out.print(answer[i]+" ");
        // }
        return answer;
    }
}
