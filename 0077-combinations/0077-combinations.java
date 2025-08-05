import java.util.*;
class Solution {
    private void dfs(int n, int k, List<List<Integer>> ans, List<Integer> tmp, int[] nums, boolean[] check, int start){
        if(tmp.size() == k){
            ans.add(new ArrayList<>(tmp));
            return;
        }

        for(int i=start; i<n; i++){
            if(check[i]) continue;

            tmp.add(nums[i]);
            check[i] = true;
            dfs(n, k, ans, tmp, nums, check, i+1);
            check[i] = false;
            tmp.remove(tmp.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        boolean[] check = new boolean[n];
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = i+1;
        }

        dfs(n, k, ans, tmp, nums, check, 0);

        return ans;
    }
}