class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<2) return s;
        String ans = String.valueOf(s.charAt(0));
        for(int mid=1; mid<s.length()-1; mid++){
            int left = mid-1, right = mid+1;
            while(left>=0 && right<=s.length()-1){
                if(s.charAt(left)==s.charAt(right)){
                    if(ans.length()<right-left+1){
                        ans = s.substring(left, right+1);
                    }
                    left--; right++;
                }else{
                    break;
                }
            }
        }

        for(int mid=0; mid<s.length()-1; mid++){
            int left =mid, right = mid+1;
            while(left>=0 && right<=s.length()-1){
                if(s.charAt(left)==s.charAt(right)){
                    if(ans.length()<right-left+1){
                        ans = s.substring(left, right+1);
                    }
                    left--; right++;
                }else{
                    break;
                }
            }
        }
        return ans;
    }
}