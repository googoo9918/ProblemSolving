import java.util.*;
class Solution {
    public int solution(int n) {
        String sans = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(sans);
        sans = sb.reverse().toString();
        return Integer.parseInt(sans, 3);
    }
}