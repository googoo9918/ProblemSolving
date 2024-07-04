class Solution {
    public String solution(String s) {
        int[] al = new int[26];
        for(int i=0; i<s.length(); i++){
            al[s.charAt(i)-'a']++;
        }
        String answer = "";
        for(int i=0; i<al.length; i++){
            if(al[i] == 1){
                answer += (char)(i+'a');
            }
        }
        return answer;
    }
}