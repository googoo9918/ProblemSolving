class Solution {
    public int solution(int chicken) {
        int result = 0;
        int mod = 0;
        while(chicken>0){
            System.out.println("chicken: " + chicken);
            result += chicken/10;
            System.out.println("result: " + result);
            mod += chicken%10;
            System.out.println("mod: " + mod);
            chicken /=10;
            if(mod>=10){
                chicken++;
                result++;
                mod %= 10;
            }
        }
        return result;
    }
}