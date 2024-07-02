import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(min>Math.abs(array[i]-n)){
                min = Math.abs(array[i] - n);
                answer = i;
            }
            else if(min == Math.abs(array[i]-n)){
                if(array[answer] > array[i]) answer = i;
            }
        }
        return array[answer];
    }
}