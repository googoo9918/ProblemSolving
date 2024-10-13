class Solution {
    public int solution(String s) {
        int answer = 0, sidx=0;
        while(sidx!=s.length()){
            int cnt1 = 0, cnt2 = 0;
            char ctmp = s.charAt(sidx);
            for(int i=sidx; i<s.length(); i++){
                if(s.charAt(i)==ctmp) cnt1++;
                else cnt2++;
                if(cnt1==cnt2){
                    sidx = i+1;
                    answer++;
                    break;
                }
                if(i == s.length()-1){
                    sidx = s.length();
                    answer++;
                }
            }
        }
        return answer;
    }
}