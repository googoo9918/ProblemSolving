import java.util.*;
class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        String[] sarr = my_string.split("");
        Arrays.sort(sarr);
        StringBuilder sb = new StringBuilder();
        for(String s : sarr){
            sb.append(s);
        }
        return sb.toString();
    }
}