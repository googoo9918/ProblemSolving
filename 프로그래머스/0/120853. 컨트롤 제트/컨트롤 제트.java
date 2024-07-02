class Solution {
    public int solution(String s) {
        String[] sarr = s.split(" ");
        int answer = Integer.parseInt(sarr[0]);
        for(int i=1; i<sarr.length; i++){
            if(sarr[i].equals("Z")){
                answer += -1 * Integer.parseInt(sarr[i-1]);
            }else{
            answer += Integer.parseInt(sarr[i]);
            }
        }
        return answer;
    }
}