class Solution {
    public boolean isPalindrome(int x) {
        String tmp = String.valueOf(x);
        int left = 0, right = tmp.length()-1;
        while(left<right){
            if(tmp.charAt(left) != tmp.charAt(right)){
                return false;
            }
            left++; right--;
        }
        return true;
    }
}