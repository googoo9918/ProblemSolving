class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0, tmp=0;
        for(int m=i; m<=j; m++){
            tmp = m;
            while(m>0){
                if(m%10 == k) answer++;
                m /= 10;
            }
            m = tmp;
        }
        return answer;
    }
}