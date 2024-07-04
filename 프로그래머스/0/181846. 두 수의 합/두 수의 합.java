import java.math.*;
class Solution {
    public String solution(String a, String b) {
        BigInteger ba = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        BigInteger sum = ba.add(bb);
        return sum.toString();
    }
}