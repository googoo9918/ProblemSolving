import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0) list.add(arr[i]);
        }
        if(list.size()==0) return new int[]{-1};
        int[] answer = new int[list.size()];
        int idx = 0;
        for(int i:list){
            answer[idx++] = i;
        }
        Arrays.sort(answer);
        return answer;
    }
}