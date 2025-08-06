class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int cnt = 0;
        int zeroSum = 0;
        while(!s.equals("1")){
            char[] carr = s.toCharArray();
            int zeroCnt = 0;
            for(int i=0; i<carr.length; i++){
                if(carr[i] == '0') zeroCnt++;
            }
            
            int afterLen = carr.length - zeroCnt;
            cnt++;
            zeroSum += zeroCnt;
            s = Integer.toBinaryString(afterLen);
        }
        
        return new int[]{cnt, zeroSum};
    }
}