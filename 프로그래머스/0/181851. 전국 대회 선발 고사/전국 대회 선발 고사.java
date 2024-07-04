class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] iarr = new int[3];
        int idx = 0;
        // 등수 순서대로 돌면서 -> true면 넣기(rank idx 넣어야됨), 3명 다 찾으면 종료
        for(int i=0; i<rank.length; i++){
            for(int j=0; j<rank.length; j++){
                if(rank[j] == i+1 && attendance[j] == true){
                    iarr[idx++] = j;
                }
            }
            if(idx==3) break;
        }
        return 10000*iarr[0] + 100*iarr[1] + iarr[2];
    }
}