import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0, sum = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        
        for(int i=0; i<list.size(); i++){
            sum -= 1;
            if(sum<0) break;
            answer++;
        }
        
        
        return answer;
    }
}