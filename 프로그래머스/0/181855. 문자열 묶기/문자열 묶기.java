class Solution {
    public int solution(String[] strArr) {
        int[] lenArr = new int[31];
        for(int i=0; i<strArr.length; i++){
            lenArr[strArr[i].length()]++;
        }
        int answer = 0;
        for(int i : lenArr){
            if(answer<i) answer = i;
        }
        return answer;
    }
}