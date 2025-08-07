class Solution {
    public int solution(int n) {
        int answer = 0;
        String nBinary = Integer.toBinaryString(n);
        nBinary = nBinary.replace("0", "");
        int nLen = nBinary.length();
        for(int i=n+1; i<=1000000; i++){
            String iBinary = Integer.toBinaryString(i);
            iBinary = iBinary.replace("0","");
            int iLen = iBinary.length();
            if(nLen == iLen){
                answer = i;
                break;
            }
        }
        return answer;
    }
}