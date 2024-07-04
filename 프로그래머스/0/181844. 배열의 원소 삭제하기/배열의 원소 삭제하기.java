import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        List<Integer> deleteList = new ArrayList<>();
        int idx = 0;
        for(int i : delete_list) deleteList.add(i);
        for(int i=0; i<arr.length; i++){
            if(!deleteList.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        idx = 0;
        for(int i: list){
            answer[idx++] = i;
        }
        return answer;
    }
}