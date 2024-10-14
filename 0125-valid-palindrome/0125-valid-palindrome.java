import java.io.*;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        // s = s.replaceAll("[^a-z0-9]", "");
        // StringBuilder sb = new StringBuilder(s);
        // return s.equals(sb.reverse().toString());
        int left = 0, right = s.length()-1;
        // char[] carr = s.toCharArray();
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))) left++;
            else if(!Character.isLetterOrDigit(s.charAt(right))) right--;
            else{
                if(s.charAt(left) != s.charAt(right)) return false;
                left++;
                right--; 
            }
            // char c = carr[left];
            // carr[left] = carr[right];
            // carr[right] = c;
            // left++; right--;
        }
        // return s.equals(new String(carr));
        return true;
    }
}