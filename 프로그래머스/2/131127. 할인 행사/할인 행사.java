import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        
        for(int i=0; i <= discount.length - 10; i++){
            Map<String, Integer> map = new HashMap<>();
            for(int j=0; j<want.length; j++){
                map.put(want[j], number[j]);
            }
            for(int j=i; j<i+10; j++){
                map.put(discount[j], map.getOrDefault(discount[j], 0)-1);
            }
            
            if(emptyMap(map)) answer++;
        }
        return answer;
    }
    
    private boolean emptyMap(Map<String, Integer> map){
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() != 0) return false;
        }
        return true;
    }
}