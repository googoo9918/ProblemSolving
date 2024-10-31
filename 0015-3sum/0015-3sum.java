class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> anss = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            List<Integer> tmp = new ArrayList<>();
            for(int j=0; j<nums.length; j++){
                if(i!=j) tmp.add(nums[j]);
            }

            int left=0, right=tmp.size()-1;
            while(left<right){
                int leftValue=tmp.get(left), rightValue=tmp.get(right); 
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