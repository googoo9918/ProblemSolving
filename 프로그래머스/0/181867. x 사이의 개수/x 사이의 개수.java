class Solution {
    public int[] solution(String myString) {
        String[] sarr = myString.split("x");
        int len = myString.endsWith("x") ? 1 : 0;
        int[] answer = new int[sarr.length+len];
        for(int i=0; i<sarr.length; i++){
            answer[i] = sarr[i].length();
        }
        return answer;
    }
}