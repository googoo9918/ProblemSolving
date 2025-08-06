import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] sarr = s.split(" ", -1);
        
        for(String str : sarr){
            char[] carr = str.toCharArray();
            
            for(int i=0; i<carr.length; i++){
                if(i==0 && Character.isLowerCase(carr[i])){
                    carr[i] = Character.toUpperCase(carr[i]);
                }else if(i!=0 && Character.isUpperCase(carr[i])){
                    carr[i] = Character.toLowerCase(carr[i]);
                }
            }
            
            for(char c : carr){
                sb.append(c);
            }
            
            sb.append(" ");
        }
        
        sb.setLength(sb.length()-1);
        
        return sb.toString();
    }
}