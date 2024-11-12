class Solution {
    private void dfs(List<List<Integer>> answer, List<Integer> ans, boolean[] used, int n, int k,int idx){
        if(ans.size() == k){
            answer.add(new ArrayList<>(ans));
            return;
        }

        for(int i=idx; i<=n; i++){
            if(used[i-1]) continue;
            ans.add(i);
            used[i-1] = true;
            dfs(answer, ans, used, n, k, i+1);
            ans.remove(ans.size()-1);
            used[i-1] = false;
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean[] used = new boolean[n];

        dfs(answer, ans, used, n, k, 1);
        return answer;
    }
}