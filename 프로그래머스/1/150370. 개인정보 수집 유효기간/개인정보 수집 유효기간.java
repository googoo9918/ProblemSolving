import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(String term : terms){
            String[] termArr = term.split(" ");
            map.put(termArr[0].charAt(0), Integer.parseInt(termArr[1]));
        }
        
        int idx = 1;
        List<Integer> list = new ArrayList<>();
        for(String privacy : privacies){
            int afterPrivacy = StringToSum(privacy);
            int plus = map.get(privacy.split(" ")[1].charAt(0));
            if(afterPrivacy + 28*plus -1 < StringToSum(today)){
                list.add(idx);
            }
            
            idx++;
        }
        
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        
        return ans;
    }
    
    private int StringToSum(String privacy){
        String[] privacyArr = privacy.split(" ");
        String[] privacyDate = privacyArr[0].split("\\.");
        
        int year = Integer.parseInt(privacyDate[0]);
        int month = Integer.parseInt(privacyDate[1]);
        int day = Integer.parseInt(privacyDate[2]);
        
        int sum = day + 28 * (12 * year + month);
        
        return sum;
    }
}