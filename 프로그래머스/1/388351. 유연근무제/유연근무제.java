class Solution {
    // startday = 1 -> 토,일 idx는 5,6
    // startday = 2 -> 4,5
    // startday = 3 -> 3,4
    // startday = 4 -> 2,3
    // startday = 5 -> 1,2
    // startday = 6 -> 0,1
    // startday = 7 -> 6,0
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for(int i=0; i<schedules.length; i++){
            boolean flag = true;
            for(int j=0; j<timelogs[0].length; j++){
                if(startday + j == 6 || startday + j == 7 || startday + j == 13) continue;
                int hour = schedules[i] / 100;
                int minute = schedules[i] % 100 + 10;
                
                int time = 60*hour + minute;
                
                int targetHour = time / 60;
                int targetMinute = time % 60;
                int targetTime = targetHour*100 + targetMinute;
                if(targetTime < timelogs[i][j]){
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
        }
        return answer;
    }
}