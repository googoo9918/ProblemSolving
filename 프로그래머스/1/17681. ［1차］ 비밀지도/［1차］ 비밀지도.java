class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr1.length; i++){
            String tmp = Integer.toBinaryString(arr1[i] | arr2[i]);
            if(tmp.length()<n){
                for(int j=0; j<n-tmp.length(); j++){
                    sb.append("0");
                }
                tmp = sb.append(tmp).toString();
                sb.setLength(0);
            }
            for(int j=0; j<n; j++){
                if(tmp.charAt(j) == '1') sb.append("#");
                else sb.append(" ");
            }
            answer[i] = sb.toString();
            sb.setLength(0);
        }
        return answer;
    }
}