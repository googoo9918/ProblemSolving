class Solution {
    public int solution(String[] order) {
        int answer = 0; 
        for(int i=0; i<order.length; i++){
            boolean ameri = false, latte = false;
            ameri = order[i].indexOf("ameri") != -1 ? true : false;
            latte = order[i].indexOf("latte") != -1 ? true : false;
            if(ameri == true) answer += 4500;
            else if(latte == true) answer += 5000;
            else answer += 4500;
        }
        return answer;
    }
}