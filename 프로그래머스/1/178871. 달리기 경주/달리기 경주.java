import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i<players.length; i++){
            map.put(players[i], i);
        }
        
        for(String calling : callings){
            int idx = map.get(calling);
            String player = players[idx-1];
            
            map.put(calling, idx-1);
            map.put(player, idx);
            
            String tmp = players[idx];
            players[idx] = players[idx-1];
            players[idx-1] = tmp;
        }
        
        return players;
    }
}