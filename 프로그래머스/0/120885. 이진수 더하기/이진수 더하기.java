class Solution {
    public String solution(String bin1, String bin2) {
        int ibin1 = Integer.parseInt(bin1, 2), ibin2 = Integer.parseInt(bin2,2);
        String answer = Integer.toBinaryString(ibin1+ibin2);
        return answer;
    }
}