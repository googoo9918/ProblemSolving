class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> llist = new ArrayList<>();
        List<String> dlist = new ArrayList<>();

        for(String log : logs){
            if(Character.isLetter(log.split(" ")[1].charAt(0))){
                llist.add(log);
            }
            else{
                dlist.add(log);
            }
        }

        llist.sort((s1,s2) ->{
            String[] s1x = s1.split(" ",2);
            String[] s2x = s2.split(" ",2);

            int compared = s1x[1].compareTo(s2x[1]);
            if(compared == 0) return s1x[0].compareTo(s2x[0]);
            else return compared;
        });

        llist.addAll(dlist);
        return llist.toArray(new String[0]);
    }
}