class Solution {
    public void dfs(List<String> answer, Map<Character, String> numbers, String digits, int index, StringBuilder sb){
        if(digits.length() == sb.length()){
            answer.add(sb.toString());
            return;
        }

        for(char c : numbers.get(digits.charAt(index)).toCharArray()){
            dfs(answer, numbers, digits, index+1, new StringBuilder(sb).append(c));
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();
        if(digits.length() == 0) return answer;
        Map<Character, String> numbers = new HashMap<>();
        numbers.put('2', "abc");
        numbers.put('3', "def");
        numbers.put('4', "ghi");
        numbers.put('5', "jkl");
        numbers.put('6', "mno");
        numbers.put('7', "pqrs");
        numbers.put('8', "tuv");
        numbers.put('9', "wxyz");

        dfs(answer, numbers, digits, 0, new StringBuilder());
        return answer;
    }
}