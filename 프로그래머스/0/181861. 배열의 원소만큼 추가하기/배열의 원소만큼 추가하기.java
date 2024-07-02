import java.util.*;
class Solution {
    public Integer[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                list.add(arr[i]);
            }
        }
        return list.toArray(new Integer[list.size()]);
    }
}