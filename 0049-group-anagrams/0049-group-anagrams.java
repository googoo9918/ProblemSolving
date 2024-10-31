class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<char[]> clist = new ArrayList<>();
        for(String str : strs){
            clist.add(str.toCharArray());
        }

        List<String> slist = new ArrayList<>();
        
        for(char[] carr : clist){
            Arrays.sort(carr);
            slist.add(new String(carr));
        }

        for(String s : slist){
            System.out.println(s);
        }
        List<List<String>> answer = new ArrayList<>();
        Set<String> check = new HashSet<>();

        for(int i=0; i<slist.size(); i++){
            String stmp = slist.get(i);
            if(!check.contains(stmp)){
                List<String> tmp = new ArrayList<>();
                for(int j=i; j<slist.size(); j++){
                    if(stmp.equals(slist.get(j))){
                        tmp.add(strs[j]);
                    }
                }
                answer.add(tmp);
            }
            check.add(stmp);
        }

        return answer;
    }
}