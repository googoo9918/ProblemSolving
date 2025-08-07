import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int row = 0, col = 0;
        for(int i=1; i<=Math.sqrt(yellow); i++){
            if(yellow % i == 0){
                row = yellow/i;
                col = i;
                
                if(brown + yellow == (row+2) * (col+2)){
                    return new int[]{row+2, col+2};
                }
            }
        }
        
        return new int[]{0};
    }
}