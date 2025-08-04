import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();
        
        for(String s : participant){
            participantMap.put(s, participantMap.getOrDefault(s, 0)+1);
        }
        
        for(String s : completion){
            participantMap.put(s, participantMap.get(s)-1);
        }
        
        for(Map.Entry<String, Integer> entry : participantMap.entrySet()){
            if(entry.getValue()!=0) answer = entry.getKey();
        }
        return answer;
    }
}