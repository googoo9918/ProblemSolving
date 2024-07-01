import java.util.*;
class Solution {
    public int[] solution(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while(n != 1){
            for(int i=2; i<=n; i++){
                if(n%i==0){
                    n /= i;
                    map.put(i, map.getOrDefault(i, 0) + 1);
                    break;
                }
            }
        }
        int[] answer = new int[map.size()];
        int idx = 0;
        for(Integer i : map.keySet()){
            answer[idx++] = i;
        }
        Arrays.sort(answer);
        return answer;
    }
}