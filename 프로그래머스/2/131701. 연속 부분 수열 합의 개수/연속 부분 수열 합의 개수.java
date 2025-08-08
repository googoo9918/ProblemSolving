import java.util.*;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        
        // 길이
        for(int i=0; i<elements.length; i++){
            // 시작점
            for(int j=0; j<elements.length; j++){
                int sum = 0;
                for(int k=j; k<=i+j; k++){
                    sum += elements[k%elements.length];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}