class Solution {
    private void dfs(List<List<Integer>> answer, List<Integer> ans, boolean[] used, int[] nums){
        if(ans.size()==nums.length){
            answer.add(new ArrayList<>(ans));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;
            ans.add(nums[i]);
            used[i] = true;
            dfs(answer, ans, used, nums);
            ans.remove(ans.size()-1);
            used[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        dfs(answer, ans, used, nums);
        
        return answer;
    }
}