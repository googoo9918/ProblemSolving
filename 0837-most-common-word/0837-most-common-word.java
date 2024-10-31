class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().replaceAll("\\W+", " ").split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>(Arrays.asList(banned));

        for(String word : words){
            if(!list.contains(word)){
                map.put(word, map.getOrDefault(word,0)+1);
            }
        }

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}