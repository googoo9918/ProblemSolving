import java.util.*;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int xsum = 0, ysum =0;
        for(int i=0; i<keyinput.length; i++){
            int dx = keyinput[i].equals("right") ? 1 : keyinput[i].equals("left") ? -1 : 0;
            int dy = keyinput[i].equals("up") ? 1 : keyinput[i].equals("down") ? -1 : 0;
            if(Math.abs(xsum + dx) <= Math.abs(board[0]/2)) xsum += dx;
            if(Math.abs(ysum + dy) <= Math.abs(board[1]/2)) ysum += dy;
        }
        return new int[]{xsum, ysum};
    }
}