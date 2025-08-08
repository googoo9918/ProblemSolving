import java.util.*;
class Solution {
    private boolean isMultiple(int[] arr, int answer){
        for(int i : arr){
            if(answer % i != 0) return false; 
        }
        
        return true;
    }
    public int solution(int[] arr) {
        int answer = 1;
        
        while(true){
            if(isMultiple(arr, answer)) break;
            answer++;
        }
        return answer;
    }
}