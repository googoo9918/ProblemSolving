import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : tangerine){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i : list){
            answer++;
            if(k<=i) break;
            
            k -= i;
        }
        return answer;
    }
}