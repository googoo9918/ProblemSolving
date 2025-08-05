import java.util.*;
class Solution {
    private void dfs(List<List<Integer>> ans, List<Integer> tmp, int[] nums, int start){
        ans.add(new ArrayList<>(tmp));
        for(int i=start; i<nums.length; i++){
            tmp.add(nums[i]);
            dfs(ans, tmp, nums, i+1);
            tmp.remove(tmp.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();

        dfs(ans, tmp, nums, 0);

        return ans;
    }
}