import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        for(String s : cards1){
            queue1.add(s);
        }
        for(String s : cards2){
            queue2.add(s);
        }
        
        for(int i=0; i<goal.length; i++){
            if(goal[i].equals(queue1.peek())){
                queue1.poll();
            }
            else if(goal[i].equals(queue2.peek())){
                queue2.poll();
            }
            else{
                return "No";
            }
        }
        return "Yes";
    }
}