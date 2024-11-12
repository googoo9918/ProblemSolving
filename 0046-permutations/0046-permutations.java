class Solution {
    private void dfs(List<List<Integer>> answer, List<Integer> ans, int[] nums, boolean[] visited){
        if(ans.size()==nums.length){
            answer.add(new ArrayList<>(ans));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(visited[i]) continue;
            visited[i] = true;
            ans.add(nums[i]);
            dfs(answer, ans, nums, visited);
            ans.remove(ans.size()-1);
            visited[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(answer, ans, nums, visited);

        return answer;
    }
}