class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = my_str.length()%n == 0 ? new String[my_str.length()/n] : new String[my_str.length()/n+1];
        for(int i=0; i<answer.length; i++){
            answer[i] = "";
            for(int j=0; j<n; j++){
                answer[i] += my_str.charAt(n*i +j);
                if(n*i +j == my_str.length()-1) break;
            } 
        }
        return answer;
    }
}