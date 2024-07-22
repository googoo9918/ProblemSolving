class Solution {
    public int solution(int n) {
        int answer = Integer.MAX_VALUE;
        for(int i=n; i>=1; i--){
            if(n%i == 1) answer = Math.min(i,answer);
        }
        return answer;
    }
}