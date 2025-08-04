import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue = new LinkedList<>();

        int max = 0;
        for(char c1 : s.toCharArray()){
            if(!queue.contains(c1)){
                queue.add(c1);
                if(max<queue.size()){
                    max = queue.size();
                }
            } else{
                while(queue.peek() != c1){
                    queue.poll();
                }
                queue.poll();
                queue.add(c1);
            }
        }

        return max;
    }
}