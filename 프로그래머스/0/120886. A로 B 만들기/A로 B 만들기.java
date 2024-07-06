import java.util.*;
class Solution {
    public int solution(String before, String after) {
        HashMap<Character, Integer> bmap = new HashMap<>();
        HashMap<Character, Integer> amap = new HashMap<>();
        for(int i=0; i<before.length(); i++){
            bmap.put(before.charAt(i), bmap.getOrDefault(before.charAt(i),0) + 1);
            amap.put(after.charAt(i), amap.getOrDefault(after.charAt(i),0) + 1);
        }
        
        return bmap.equals(amap) ? 1 : 0;
    }
}