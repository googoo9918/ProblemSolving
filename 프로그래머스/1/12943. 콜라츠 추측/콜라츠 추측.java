class Solution {
    public int solution(int num) {
        if(num == 1) return 0;
        long lnum = num;
        int ans = 0;
        while(ans<=500){
            ans++;
            if(lnum%2==0) lnum/=2;
            else lnum = 3*lnum+1;
            
            if(lnum==1) return ans;
        }
        return -1;
    }
}