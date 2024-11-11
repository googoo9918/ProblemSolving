class Solution {
    public int[] dailyTemperatures(int[] temp) {
       Deque<Integer> stack = new ArrayDeque<>();
       int[] ans = new int[temp.length];
       for(int i=0; i<temp.length; i++){
        while(!stack.isEmpty() && temp[stack.peek()]<temp[i]){
            int idx = stack.pop();
            ans[idx] = i - idx;
        }
        stack.push(i);
       } 
       return ans;
    }
}