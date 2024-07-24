import java.util.*;
class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ') sb.append(" ");
            else{
                char c = s.charAt(i);
                if(Character.isUpperCase(c)){
                   if(c+n <= 'Z'){
                      sb.append((char)(c+n)); 
                    }
                    else{
                        sb.append((char)(c+n-26));
                    }
                }
                else{
                    if(c+n <= 'z') sb.append((char)(c+n));
                    else sb.append((char)(c+n-26));
                }
            }
        }
        return sb.toString();
    }
}