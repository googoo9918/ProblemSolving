import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<survey.length; i++){
            if(choices[i] > 4) map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1),0) + choices[i]-4);
            else map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0),0) + 4-choices[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        
        if(map.getOrDefault('R',0) == map.getOrDefault('T',0)) sb.append("R");
        else if(map.getOrDefault('R',0) > map.getOrDefault('T',0)) sb.append("R");
        else sb.append("T");
        
        if(map.getOrDefault('C',0) == map.getOrDefault('F',0)) sb.append("C");
        else if(map.getOrDefault('C',0) > map.getOrDefault('F',0)) sb.append("C");
        else sb.append("F");
        
        if(map.getOrDefault('J',0) == map.getOrDefault('M',0)) sb.append("J");
        else if(map.getOrDefault('J',0) > map.getOrDefault('M',0)) sb.append("J");
        else sb.append("M");
        
        if(map.getOrDefault('A',0) == map.getOrDefault('N',0)) sb.append("A");
        else if(map.getOrDefault('A',0) > map.getOrDefault('N',0)) sb.append("A");
        else sb.append("N");
        
        return sb.toString();
    }
}