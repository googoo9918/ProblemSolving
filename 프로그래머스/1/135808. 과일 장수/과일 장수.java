import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0, idx = 0;
        Integer[] iscore = new Integer[score.length];
        for(int i : score){
            iscore[idx++] = i;
        }
        Arrays.sort(iscore, new Comparator<>(){
            @Override
            public int compare(Integer i1, Integer i2){
                return i2-i1;   
            }
        });
        for(int i=0; i< iscore.length/m; i++){
            int min = Integer.MAX_VALUE;
            for(int j=i*m; j<i*m+m; j++){
                min = Math.min(min, iscore[j]);
            }
            answer += min*m;
        }
        return answer;
    }
}