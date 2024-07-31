class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] sectionb = new boolean[n];
        for(int i=0; i<sectionb.length; i++){
            sectionb[i] = true;
        }
        for(int i: section){
            sectionb[i-1] = false;
        }
        for(int i= section[0]-1; i<n; i++){
            if(sectionb[i]==false){
                for(int j=0; j<m && i+j<n; j++){
                    sectionb[i+j] = true;
                }
                answer++;
            }
            else{
                continue;
            }
            if(isPainted(sectionb)) break;
        }
        return answer;
    }
    public boolean isPainted(boolean[] sectionb){
        for(boolean b : sectionb){
            if(b==false) return false;
        }
        return true;
    }
}