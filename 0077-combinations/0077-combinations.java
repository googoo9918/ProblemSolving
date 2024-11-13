class Solution {
    private void dfs(int n, int k, List<List<Integer>> answer, List<Integer> ans, int start){
        if(ans.size()==k){
            answer.add(new ArrayList<>(ans));
        }

        for(int i=start; i<=n; i++){
            ans.add(i);
            dfs(n, k, answer, ans, i+1);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        dfs(n, k, answer, ans, 1);

        return answer;
    }
}