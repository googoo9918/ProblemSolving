class Solution {
    public int solution(String binomial) {
        String[] sarr = binomial.split(" ");
        int a = Integer.parseInt(sarr[0]);
        int b = Integer.parseInt(sarr[2]);
        if(sarr[1].equals("+")){
            return a+b;
        }else if(sarr[1].equals("-")){
            return a-b;
        }else{
            return a*b;
        }
    }
}