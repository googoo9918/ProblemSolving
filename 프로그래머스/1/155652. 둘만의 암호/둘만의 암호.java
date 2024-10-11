import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        boolean[] canSkip = new boolean[26];
        for(int i=0; i<skip.length(); i++){
            canSkip[skip.charAt(i) - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            int tmp = 0 , idx=0;
            while(idx < index){
                tmp++;
                if(!canSkip[(s.charAt(i) - 'a' + tmp)%26]) idx++;
                if(idx==index){
                    char c = (char)('a' + (s.charAt(i) -'a' + tmp)%26);
                    sb.append(c);
                    break;
                }
            }
        }
        return sb.toString();
    }
}