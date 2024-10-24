class Solution {
    int left,right;
    public String longestPalindrome(String s) {
        if(s.length()<1) return s;

        for(int i=0; i<s.length(); i++){
            findLongPal(s, i, i+1);
            findLongPal(s, i, i+2);
        }
        return s.substring(left, right+1);
    }

    public void findLongPal(String s, int start, int end){
        while(start>=0 && end<=s.length()-1 && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        start++; end--;
        if(end-start+1 > right-left+1){
            left = start;
            right = end;
        }
    }
}