import java.util.*;
class Solution {
    private void dfs(List<List<Integer>> ans, List<Integer> tmp, int[] candidates, int target, int sum, int start){
        if(sum == target){
            ans.add(new ArrayList<>(tmp));
            return;
        }else if(sum > target){
            return;
        }
        for(int i=start; i<candidates.length; i++){
            sum += candidates[i];
            tmp.add(candidates[i]);
            dfs(ans, tmp, candidates, target, sum, i);
            tmp.remove(tmp.size()-1);
            sum -= candidates[i];
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();

        int sum = 0;
        dfs(ans, tmp, candidates, target, sum, 0);

        return ans;
    }
}