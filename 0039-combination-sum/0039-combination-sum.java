class Solution {
    private int sumAns(List<Integer> ans){
        int sum = 0;
        for(int i : ans){
            sum += i;
        }
        return sum;
    }
    private void dfs(int[] candidates, int target, List<List<Integer>> answer, List<Integer> ans, int start){
        if(sumAns(ans)>target) return;
        if(sumAns(ans)==target){
            answer.add(new ArrayList<>(ans));
            return;
        }

        for(int i=start; i<candidates.length; i++){
            ans.add(candidates[i]);
            dfs(candidates, target, answer, ans, i);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        dfs(candidates, target, answer, ans, 0);

        return answer;
    }
}