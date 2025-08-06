import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Deque<Character> stack = new ArrayDeque<>();
        
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else{
                if(stack.size() == 0){
                    answer = false;
                    break;
                }else{
                    stack.pop();
                }
            }
        }
        
        if(stack.size() != 0) answer = false;
        return answer;
    }
}