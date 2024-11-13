class Solution {
    private void dfs(List<String> ans, Map<Character,String> map, String digits, int start, StringBuilder sb){
        if(sb.length() == digits.length()){
            ans.add(sb.toString());
            return;
        }

        for(char c : map.get(digits.charAt(start)).toCharArray()){
            dfs(ans, map, digits, start+1, new StringBuilder(sb).append(c));
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0) return ans;
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        dfs(ans, map, digits, 0, new StringBuilder());

        return ans;
    }
}