import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++){
            if(isPrime(i)) {
                answer++;
            }
        }
        return answer;
    }
    public boolean isPrime(int i){
        for(int j=2; j<=Math.sqrt(i); j++){
            if(i%j==0) return false;
        }
        return true;
    }
}