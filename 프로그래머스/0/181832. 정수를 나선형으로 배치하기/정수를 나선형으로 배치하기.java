class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int dx=0, dy=0;
        int widthEnd=n-1, heightEnd= n-1;
        int widthStart=0, heightStart =0;
        int cnt = 1;
        while(cnt<n*n){
            if(dy<widthEnd && dx==heightStart){
                answer[dx][dy++] = cnt++;
                if(dy==widthEnd) heightStart++;
            }
            else if(dy==widthEnd && dx<heightEnd){
                answer[dx++][dy] = cnt++;
                if(dx == heightEnd) widthEnd--;
            }
            else if(dy> widthStart && dx==heightEnd){
                answer[dx][dy--] = cnt++;
                if(dy == widthStart) heightEnd--;
            }
            else if(dy==widthStart && dx>heightStart){
                answer[dx--][dy] = cnt++;
                if(dx == heightStart) widthStart++;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(answer[i][j] == 0) answer[i][j] = n*n;
            }
        }
        return answer;
    }
}