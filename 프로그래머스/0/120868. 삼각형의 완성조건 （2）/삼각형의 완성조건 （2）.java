import java.util.*;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int sum = sides[0] + sides[1], ans = 0;
        for(int i=sides[1]-sides[0]; i<=sides[1]; i++){
            if(sides[0]+i>sides[1]) ans++;
        }
        for(int i=sides[1]+1; i<sum; i++){
            if(sides[0]+sides[1]>i) ans++;
        }
        return ans;
    }
}