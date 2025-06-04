import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Deque<Integer>> list = new ArrayList<>();
        
        for(int i=0; i<board.length; i++){
            Deque<Integer> deque = new ArrayDeque<>(); 
            for(int j=board[0].length-1; j>=0; j--){
                if(board[j][i] != 0) deque.push(board[j][i]);
            }
            list.add(deque);
        }
        
        Deque<Integer> krain = new ArrayDeque<>();
        for(int move : moves){
            if(!krain.isEmpty() && krain.peek() == list.get(move-1).peek()){
                list.get(move-1).pop();
                krain.pop();
                answer+=2;
                continue;
            }
            
            if(!list.get(move-1).isEmpty())
            krain.push(list.get(move-1).pop());
        }
        return answer;
    }
}