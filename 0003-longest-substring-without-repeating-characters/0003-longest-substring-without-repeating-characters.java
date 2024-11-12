class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0, right =0, ans =0;
        Map<Character, Integer> lastIndex = new HashMap<>();

        for(char c : s.toCharArray()){
            if(lastIndex.containsKey(c) && left<= lastIndex.get(c)){
                left = lastIndex.get(c)+1;
            }else{
                if(ans < right-left+1){
                    ans = right-left+1;
                }
            }
            lastIndex.put(c, right++);
        }

        return ans;
    }
}