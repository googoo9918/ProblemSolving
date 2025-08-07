import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> tmap = new HashMap<>();
        
        for(int i : tangerine){
            tmap.put(i, tmap.getOrDefault(i,0)+1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(tmap.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2){
                return e2.getValue() - e1.getValue();
            }
        });
        
        int sum = 0;
        for(Map.Entry<Integer, Integer> me : list){
            sum += me.getValue();
            answer++;
            if(sum >= k) break;
        }    
            
        return answer;
    }
}