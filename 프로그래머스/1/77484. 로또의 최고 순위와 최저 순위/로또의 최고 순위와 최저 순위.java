class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCounts = 0, sameCounts=0;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]== 0){
                zeroCounts++;
                continue;
            }
            else{
                for(int j=0; j<win_nums.length; j++){
                    if(lottos[i] == win_nums[j]) sameCounts++;
                }
            }
        }
        // 6 1 / 5 2 / 3 4 / 4 3 / 5 2
        int sumCounts = sameCounts+zeroCounts;
        if(sumCounts == 0 || sumCounts == 1){
            answer[0] = 6;
            
        }
        else{
            answer[0] = 7-sumCounts;
        }
        
        if(sameCounts == 0 || sameCounts == 1){
            answer[1] = 6;
        }
        else{
            answer[1] = 7-sameCounts;
        }
        return answer;
    }
}