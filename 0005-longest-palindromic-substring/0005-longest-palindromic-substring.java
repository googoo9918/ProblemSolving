class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i=0; i<s.length(); i++){
            int start = 0, end = start+i;
            while(end<s.length()){
                int left = start, right=end;
                boolean check = true;
                while(left<right){
                    if(s.charAt(left) != s.charAt(right)){
                        check = false;
                        break;
                    }
                    left++; right--;
                }
                if(check){
                    ans = s.substring(start,end+1);
                }
                start++; end++;
            }
        }
        return ans;
    }
}