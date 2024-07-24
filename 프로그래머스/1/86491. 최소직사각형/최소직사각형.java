import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        for(int i=0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
        }
        int maxX = 0, maxY = 0;
        for(int i=0; i<sizes.length; i++){
            maxX = Math.max(maxX, sizes[i][0]);
            maxY = Math.max(maxY, sizes[i][1]);
        }
        return maxX*maxY;
    }
}