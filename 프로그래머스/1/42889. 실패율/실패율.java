import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        double[] fails = new double[N];
        double[] challenge = new double[N];
        double[] rate = new double[N];
        
        for(int i=0; i<stages.length; i++){
            for(int j=0; j<stages[i] && j<N; j++){
                challenge[j]++;
            }
            if(stages[i]<=N) fails[stages[i]-1]++;
        }
        
        for(int i=0; i<N; i++){
            if(challenge[i]!=0) rate[i] = fails[i]/challenge[i];
            else rate[i] = 0;
        }
        int[] answer = new int[N];
        int idx = 0;
        Set<Double> set = new HashSet<>(); 
        List<Double> list = new ArrayList<>();
        for(double d : rate){
            set.add(d);
        }
        for(double d : set){
            list.add(d);
        }
        Collections.sort(list, Collections.reverseOrder());
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<rate.length; j++){
                if(list.get(i) == rate[j]) answer[idx++] = j+1;
            }
        }
        return answer;
    }
}