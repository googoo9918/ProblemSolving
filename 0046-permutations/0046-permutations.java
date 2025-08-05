import java.util.*;
class Solution {
    private void dfs(int[] nums, List<List<Integer>> ans, List<Integer> tmp, boolean[] check){
        if(tmp.size() == nums.length){
            ans.add(new ArrayList<>(tmp));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(!check[i]){
                check[i] = true;
                tmp.add(nums[i]);
                dfs(nums, ans, tmp, check);
                tmp.remove(tmp.size()-1);
                check[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        
        dfs(nums, ans, tmp, check);

        return ans;
    }
}