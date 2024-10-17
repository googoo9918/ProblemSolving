class Solution {
    public boolean isPalindrome(int x) {
        String tmp = String.valueOf(x);
        StringBuilder sb = new StringBuilder(tmp);
        if(tmp.equals(sb.reverse().toString())){
            return true;
        }
        else return false;
    }
}