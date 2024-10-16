class Solution {
    public int trap(int[] height) {
        int sum =0, left=0, right = height.length-1;
        int leftMax = height[left], rightMax = height[right];

        while(left<right){
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);

            if(leftMax<=rightMax){
                sum += leftMax - height[left];
                left++;
            }
            else{
                sum += rightMax - height[right];
                right--;
            }
        }
        return sum;
    }
}