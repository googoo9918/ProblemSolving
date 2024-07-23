import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int min = Math.min(n,m);
        int max = Math.max(n,m);
        int i2=0;
        int[] answer = new int[2];
        for(int i = 1; i<=min; i++){
            if(n%i==0 && m%i==0) answer[0] = i;
        }
        for(int i= 1; i<=min; i++){
            if(max*i%min == 0){
                answer[1] = max*i;
                break;
            }
        }
        return answer;
    }
}