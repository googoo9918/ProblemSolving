class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String[] pgList = paragraph.split("[ !?';,.]+");
        List<String> list = new ArrayList<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        for(String pg : pgList){
            if(!list.contains(pg)){
                map.put(pg, map.getOrDefault(pg,0)+1);
            }
        }

        // String answer = "";
        // int max = 0;
        // for(Map.Entry<String, Integer> entry : map.entrySet()){
        //     int tmp = entry.getValue();
        //     if(tmp>max){
        //         max = tmp;
        //         answer = entry.getKey();
        //     }
        // }

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}