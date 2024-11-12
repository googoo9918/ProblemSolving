import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> lastIndexMap = new HashMap<>();
        Map<Character, Boolean> visited = new HashMap<>();
        
        // 각 문자의 마지막 인덱스를 저장
        for (int i = 0; i < s.length(); i++) {
            lastIndexMap.put(s.charAt(i), i);
            visited.put(s.charAt(i), false);
        }
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char alpha = s.charAt(i);
            
            if (visited.get(alpha)) {
                continue;
            }
            
            // 현재 문자가 스택의 마지막 문자보다 작고, 스택의 마지막 문자가 뒤에 더 남아 있는 경우
            while (!stack.isEmpty() && alpha < stack.peek() && i < lastIndexMap.get(stack.peek())) {
                visited.put(stack.pop(), false);
            }
            
            stack.push(alpha);
            visited.put(alpha, true);
        }
        
        // 스택의 문자들을 합쳐서 결과 문자열을 만듦
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        
        return result.toString();
    }
}
