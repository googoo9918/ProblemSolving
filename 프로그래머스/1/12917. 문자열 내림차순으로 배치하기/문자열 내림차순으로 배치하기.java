import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] carr = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char c : carr){
            list.add(c);
        }
        Collections.sort(list, new Comparator<>(){
            @Override
            public int compare(Character c1, Character c2){
                return c2-c1;
            }
        });
        for(char c : list){
            answer += c;
        }
        return answer;
    }
}