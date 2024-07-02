class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int olen = arr1.length;
        int tlen = arr2.length;
        if(olen != tlen) return olen>tlen ? 1 : -1;
        else{
            int osum = 0;
            int tsum = 0;
            for(int i: arr1) osum += i;
            for(int i: arr2) tsum += i;
            
            return osum == tsum ? 0 : osum>tsum ? 1 : -1;
        }
    }
}