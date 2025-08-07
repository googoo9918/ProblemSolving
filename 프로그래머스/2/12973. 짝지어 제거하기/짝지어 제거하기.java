import java.util.*;
class Solution
{
    public int solution(String s)
    {   
        Deque<Character> deque = new ArrayDeque<>();
        
        for(char c : s.toCharArray()){
            if(deque.size() == 0) deque.push(c);
            else if(deque.peek() == c){
                deque.pop();
            }else{
                deque.push(c);
            }
        }
        return deque.size() == 0 ? 1 : 0;
    }
}