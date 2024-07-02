import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        for(int i=0; i<arr.length; i++){
            if(linkedHashSet.size()<k){
                linkedHashSet.add(arr[i]);
            }
        }
        int[] answer = new int[k];
        int idx = 0;
        for(Integer i: linkedHashSet){
            answer[idx++] = i;
        }
        if(linkedHashSet.size()< k){
            for(int i=linkedHashSet.size(); i<k; i++){
                answer[i] = -1;
            }
        }
        return answer;
    }
}