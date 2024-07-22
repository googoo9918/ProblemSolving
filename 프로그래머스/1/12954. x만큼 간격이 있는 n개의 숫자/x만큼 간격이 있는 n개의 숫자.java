class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long longX = (long) x;
        
        for (int i = 0; i < n; i++) {
            answer[i] = longX * (i + 1);
        }
        
        return answer;
    }
}