class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] carr = my_string.toCharArray();
        for(int i=0; i<my_string.length(); i++){
            for(int j=i+1; j<my_string.length(); j++){
                if(carr[i] == carr[j]){
                    carr[j] = '\0';
                }
            }
        }
        for(char c : carr){
            if(c != '\0'){
                answer += c;
            }
        }
        return answer;
    }
}