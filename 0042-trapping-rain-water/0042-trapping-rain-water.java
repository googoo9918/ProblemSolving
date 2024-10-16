class Solution {
    public int trap(int[] height) {
        int sum = 0, maxIdx = 0, max = 0;
        for(int i=0; i<height.length; i++){
            if(max<height[i]){
                max = height[i];
                maxIdx = i;
            }
        }
        int leftMax = height[0];
        for(int i=0; i<maxIdx; i++){
            leftMax = Math.max(leftMax, height[i]);
            sum += leftMax - height[i];
        }

        int rightMax = height[height.length-1];
        for(int i=height.length-1; i>maxIdx; i--){
            rightMax = Math.max(rightMax, height[i]);
            sum += rightMax - height[i];
        }

        return sum;
    }
}