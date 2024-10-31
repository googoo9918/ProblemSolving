class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> anss = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            int left=0, right=nums.length-1;
            while(left<right){
                if(left==i){
                    left++;
                    continue;
                }
                if(right==i){
                    right--;
                    continue;
                }
                int leftValue=nums[left], rightValue=nums[right];
                if(leftValue + rightValue == -nums[i]){
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(leftValue);
                    ans.add(rightValue);
                    Collections.sort(ans);
                    anss.add(ans);
                    left++;
                    right--;
                }
                else if(leftValue + rightValue > -nums[i]) right--;
                else left++;
            }
        }
        List<List<Integer>> answer = new ArrayList<>();
        for(List<Integer> l : anss){
            answer.add(l);
        }
        return answer;
    }
}