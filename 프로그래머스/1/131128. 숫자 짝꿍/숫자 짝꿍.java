import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        Map<Character, Integer> xmap = new HashMap<>();
        Map<Character, Integer> ymap = new HashMap<>();
        
        for(int i=0; i<X.length(); i++){
            xmap.put(X.charAt(i), xmap.getOrDefault(X.charAt(i),0)+1);
        }
        
        for(int i=0; i<Y.length(); i++){
            ymap.put(Y.charAt(i), ymap.getOrDefault(Y.charAt(i),0)+1);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(Map.Entry<Character, Integer> entry : xmap.entrySet()){
            int min = 0;
            char xkey = entry.getKey();
            int xvalue = entry.getValue();
            if(ymap.containsKey(xkey)){
                min = Math.min(xvalue, ymap.get(xkey));
                
                if(entry.getValue() > 0) {
                    for(int i=0; i<min; i++){
                        list.add((xkey - '0'));
                    }
                }
            }
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        
        boolean flag = true;
        for(int i : list){
            if(i!=0) flag = false;
            sb.append(i);
        }
        
        if(sb.length() == 0) return "-1";
        if(flag) return "0";
        return sb.toString();
    }
}