class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : jewels.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
        }

        int cnt = 0;
        for(char c : stones.toCharArray()){
            if(map.containsKey(c)) cnt++;
        }
        return cnt;
    }
}