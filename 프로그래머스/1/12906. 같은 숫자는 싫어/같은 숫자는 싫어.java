import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(stack.peek() != arr[i]) {
                stack.add(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];
        int idx = 0;
        for(int i: stack){
            answer[idx++] = i;
        }
        return answer;
    }
}