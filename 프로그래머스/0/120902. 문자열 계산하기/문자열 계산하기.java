class Solution {
    public int solution(String my_string) {
        String[] sarr = my_string.split(" ");
        int a = Integer.parseInt(sarr[0]);
        String s = sarr[1];
        int b = Integer.parseInt(sarr[2]);
        int sum = sarr[1].equals("+") ? a+b : a-b;
        for(int i=4; i<sarr.length; i+=2){
            int tmp = Integer.parseInt(sarr[i]);
            s = sarr[i-1];
            sum = s.equals("+") ? sum+tmp : sum-tmp;
        }
        return sum;
    }
}