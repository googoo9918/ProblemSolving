class Solution {
    public int trap(int[] height) {
        int max =0, maxIdx =0;
        for(int i=0; i<height.length; i++){
            if(max<height[i]){
                max = height[i];
                maxIdx = i;
            }
        }

        int left=0, leftMax=height[0], right=height.length-1, rightMax=height[height.length-1], sum=0;
        while(left<maxIdx){
            if(height[left]<=leftMax){
                sum += leftMax-height[left];
            }else{
                leftMax = height[left];
            }
            left++;
        }

        while(maxIdx<right){
            if(height[right]<=rightMax){
                sum += rightMax-height[right];
            }else{
                rightMax = height[right];
            }
            right--;
        }
        return sum;
    }
}