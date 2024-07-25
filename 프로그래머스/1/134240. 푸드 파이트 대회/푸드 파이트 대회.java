import java.util.*;
class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                stack.push(i);
                sb.append(i);
            }
        }
        sb.append("0");
        int n = stack.size();
        for(int i=0; i<n; i++){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}