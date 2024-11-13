class Solution {
    private void dfs(List<List<Integer>> answer, List<Integer> ans, int[] nums, int start, int size){
        if(ans.size()==size){
            answer.add(new ArrayList<>(ans));
            return;
        }

        for(int i=start; i<nums.length; i++){
            ans.add(nums[i]);
            dfs(answer, ans, nums, i+1, size);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<=nums.length; i++){
            dfs(answer, ans, nums, 0, i);
        }

        return answer;
    }
}