import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqrt = (long)Math.sqrt(n);
        if(sqrt*sqrt == n){
            answer = (long)Math.pow(sqrt+1,2);
            return answer;
        }
        return -1;
    }
}