import java.util.*;
class Solution {
    public Integer[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i)))
                list.add(my_string.charAt(i)-'0');
        }
        Integer[] answer = list.toArray(new Integer[list.size()]);
        Arrays.sort(answer);
        return answer;
    }
}