import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return arr;
        int tmp = 1;
        for(int i=2; i<arr.length; i=i*2){
            if(arr.length>i) tmp++;
        }
        int[] answer = new int[(int)Math.pow(2,tmp)];
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i]; 
        }
        return answer;
    }
}