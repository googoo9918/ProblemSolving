class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(target-nums[i],i);
            }else{
                int tmp = map.get(nums[i]);
                return new int[]{tmp,i};
            }
        }
        return new int[]{0,0};
    }
}