class Solution {
    public boolean solution(int x) {
        int dx = x;
        int sum = 0;
        while(dx>0){
            sum += dx%10;
            dx /= 10;
        }
        
        return x%sum == 0 ? true : false;
    }
}