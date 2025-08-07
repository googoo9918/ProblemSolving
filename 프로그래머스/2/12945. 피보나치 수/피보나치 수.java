class Solution {
    public int solution(int n) {
        int[] iarr = new int[n+1];
        iarr[0] = 0;
        iarr[1] = 1;
        for(int i=2; i<iarr.length; i++){
            iarr[i] = (iarr[i-1] + iarr[i-2]) % 1234567;
        }
        return iarr[n];
    }
}