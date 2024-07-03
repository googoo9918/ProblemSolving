class Solution {
    public int solution(int a, int b) {
        int gcd = findGCD(a,b);
        a /= gcd;
        b /= gcd;
        if(a%b==0) return 1;
        while(b%2==0) b/=2;
        while(b%5==0) b/=5;
        return b==1 ? 1 : 2;
    }
    int findGCD(int a, int b){
        if(b==0){
            return a;
        }
        return findGCD(b, a%b);
    }
}