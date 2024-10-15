class Solution {
    int left, length;
    private void findPalindrome(String s, int start, int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }

        if(length < end-start-1){
            left = start+1;
            length = end-start-1;
        }
    }
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        for(int i=0; i<s.length(); i++){
            findPalindrome(s, i, i+1);
            findPalindrome(s, i, i+2);
        }

        return s.substring(left, left+length);
    }
}