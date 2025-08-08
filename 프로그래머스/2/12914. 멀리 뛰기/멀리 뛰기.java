class Solution {
    public long solution(int n) {
        int[] iarr = new int[2001];
        
        iarr[1] = 1;
        iarr[2] = 2;
        
        for(int i=3; i<=n; i++){
            iarr[i] = (iarr[i-1] + iarr[i-2]) % 1234567;
        }
        return iarr[n];
    }
}