class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                i = map.get(c);
                map.clear();
            }else{
                map.put(c, i);
                if(ans < map.size()){
                    ans = map.size();
                }
            }
        }
        return ans;
    }
}