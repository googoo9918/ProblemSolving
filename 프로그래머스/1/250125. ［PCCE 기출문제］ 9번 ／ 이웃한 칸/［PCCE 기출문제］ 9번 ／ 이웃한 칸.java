class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String s = board[h][w];
        if(h-1 >=0 && s.equals(board[h-1][w])) answer++;
        if(w-1 >=0 && s.equals(board[h][w-1])) answer++;
        if(h+1 < board.length && s.equals(board[h+1][w])) answer++;
        if(w+1 < board[0].length && s.equals(board[h][w+1])) answer++;
        return answer;
    }
}