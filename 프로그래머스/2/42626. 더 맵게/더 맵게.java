import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : scoville){
            pq.add(i);
        }
        
        while(pq.size()>=2 && pq.peek()<K){
            int low1 = pq.poll();
            int low2 = pq.poll();
            pq.add(low1 + low2*2);
            answer++;
        }
        if(pq.size()==1 && pq.peek()<K) return -1;
        return answer;
    }
}