import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0; i<s.length(); i++){
            if(isRight(sb.toString())) answer++;
            
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
        }
        return answer;
    }
    
    private boolean isRight(String s){
        Deque<Character> deque = new ArrayDeque<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                deque.addFirst(s.charAt(i));
            }else{
                if(deque.size() == 0) return false;
                else if(s.charAt(i) == ']' && deque.pollFirst() != '[') return false;
                else if(s.charAt(i) == ')' && deque.pollFirst() != '(') return false;
                else if(s.charAt(i) == '}' && deque.pollFirst() != '{') return false;
            }
        }
        
        if(deque.size() != 0) return false;
        return true;
    }
}