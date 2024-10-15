class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] tstrs = Arrays.copyOf(strs, strs.length);
        for(int i=0; i<tstrs.length; i++){
            char[] carr = tstrs[i].toCharArray();
            Arrays.sort(carr);
            tstrs[i] = new String(carr);
            System.out.println(tstrs[i]);
        }

        Map<String, List<Integer>> map = new HashMap<>();

        for(int i=0; i<tstrs.length; i++){
            if(!map.containsKey(tstrs[i])){
                map.put(tstrs[i], new ArrayList<>());
            }
            map.get(tstrs[i]).add(i);
        }

        List<List<String>> list = new ArrayList<>();
        for(Map.Entry<String, List<Integer>> entry : map.entrySet()){
            List<Integer> ilist = entry.getValue();
            List<String> slist = new ArrayList<>();
            for(int i=0; i<ilist.size(); i++){
                slist.add(strs[ilist.get(i)]);
            }
            list.add(slist);
        }
        return list;
    }
}