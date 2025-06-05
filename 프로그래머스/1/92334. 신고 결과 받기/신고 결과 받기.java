import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] reports, int k) {
        int[] answer = new int[id_list.length];
        boolean[][] flag = new boolean[id_list.length][id_list.length];
        
        Map<String, Integer> idxMap = new HashMap<>();
        for(int i=0; i<id_list.length; i++){
            idxMap.put(id_list[i], i);
        }
        
        Map<String, Integer> reportMap = new HashMap<>();
        for(String report : reports){
            String[] reportArr = report.split(" ");
            if(!flag[idxMap.get(reportArr[0])][idxMap.get(reportArr[1])]){
                flag[idxMap.get(reportArr[0])][idxMap.get(reportArr[1])] = true;
                reportMap.put(reportArr[1], reportMap.getOrDefault(reportArr[1], 0)+1);
            }
        }
        
        // 신고당한 사람의 횟수가 map에 저장되어 있다.
        // 신고당한 횟수가 k 이상일 때, 신고한 사람의 idx의 cnt를 증가시켜야 한다.
        for(String id : id_list){
            if(!reportMap.containsKey(id) || (reportMap.containsKey(id) && reportMap.get(id) < k)) continue;
            
            for(int i=0; i<flag.length; i++){
                if(flag[i][idxMap.get(id)]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}