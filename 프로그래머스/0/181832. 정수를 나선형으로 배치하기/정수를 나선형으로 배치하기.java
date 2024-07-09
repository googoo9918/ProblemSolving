class Solution {
    public int[][] solution(int n) {
    int[][] answer = new int[n][n];
    int cnt = 1;
    int x = 0, y = 0;
    int direction = 0; 
    
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    
    while (cnt <= n * n) {
        answer[x][y] = cnt++;
        
        int nx = x + dx[direction];
        int ny = y + dy[direction];
        
        if (nx >= 0 && ny >= 0 && nx < n && ny < n && answer[nx][ny] == 0) {
            x = nx;
            y = ny;
        } else {
            direction = (direction + 1) % 4;
            x += dx[direction];
            y += dy[direction];
        }
    }
    
    return answer;
}
}