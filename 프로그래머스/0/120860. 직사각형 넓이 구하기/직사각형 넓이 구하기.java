import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int x = dots[0][0] != dots[1][0] ? Math.abs(dots[0][0]-dots[1][0]) : Math.abs(dots[0][0]-dots[2][0]);
        int y = dots[0][1] != dots[1][1] ? Math.abs(dots[0][1]-dots[1][1]) : Math.abs(dots[0][1]-dots[2][1]); 
        return x*y;
    }
}