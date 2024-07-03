class Solution {
    public int[] solution(int[][] score) {
        double[] avg = new double[score.length];
        int[] rank = new int[score.length];
        for(int i=0; i<avg.length; i++){
            avg[i] = (double)(score[i][0] + score[i][1])/2;
        }
        for(int i=0; i<rank.length; i++){
            rank[i] =1;
            for(int j=0; j<rank.length; j++){
                if(avg[i] < avg[j]){
                    rank[i]++;
                }
            }
        }
        return rank;
    }
}