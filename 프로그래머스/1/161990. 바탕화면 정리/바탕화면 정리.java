import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int minRow = Integer.MAX_VALUE , minCol = Integer.MAX_VALUE, maxRow = Integer.MIN_VALUE, maxCol = Integer.MIN_VALUE;
        
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[0].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    if(minRow > i) minRow = i;
                    if(minCol > j) minCol = j;
                    if(maxRow < i+1) maxRow = i+1;
                    if(maxCol < j+1) maxCol = j+1;
                }
            }
        }
        return new int[]{minRow, minCol, maxRow, maxCol};
    }
}