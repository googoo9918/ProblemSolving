class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i<nums.length-2; i++){
            int tmp = nums[i];
            for(int j=i+1; j<nums.length-1; j++){
                tmp += nums[j];
                for(int k=j+1; k<nums.length; k++){
                    tmp += nums[k];
                    if(isPrime(tmp)) answer++;
                    tmp -= nums[k];
                }
                tmp -= nums[j];
            }
            tmp -= nums[i];
        }

        return answer;
    }
    public boolean isPrime(int num){
        for(int i=2;i<num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}