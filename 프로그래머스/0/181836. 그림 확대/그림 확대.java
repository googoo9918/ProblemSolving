import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<picture.length; i++){
            String tmp = "";
            for(int j=0; j<picture[i].length(); j++){
                for(int l=0; l<k; l++){
                    tmp += picture[i].charAt(j);
                }
            }
            for(int m=0; m<k; m++){
                list.add(tmp);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}