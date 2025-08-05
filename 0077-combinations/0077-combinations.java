class Solution {
    private void dfs(List<List<Integer>> answer, List<Integer> ans, int n, int k, int idx) {
        if (ans.size() == k) {
            answer.add(new ArrayList<>(ans));
            return;
        }

        for (int i = idx; i <= n - (k - ans.size()) + 1; i++) {
            ans.add(i);
            dfs(answer, ans, n, k, i + 1);
            ans.remove(ans.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        dfs(answer, ans, n, k, 1);
        return answer;
    }
}
