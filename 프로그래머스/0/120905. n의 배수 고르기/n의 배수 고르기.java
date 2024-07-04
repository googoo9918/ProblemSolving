import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0) list.add(numlist[i]);
        }
        int[] answer = new int[list.size()];
        int idx =0;
        for(int i:list){
            answer[idx++] = i;
        }
        return answer;
    }
}