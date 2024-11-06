class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> llog = new ArrayList<>();
        List<String> dlog = new ArrayList<>();
        for(String log : logs){
            if(Character.isLetter(log.split(" ",2)[1].charAt(0))){
                llog.add(log);
            }else{
                dlog.add(log);
            }
        }

        Collections.sort(llog, new Comparator<>(){
            @Override
            public int compare(String s1, String s2){
                String[] sarr1 = s1.split(" ", 2);
                String[] sarr2 = s2.split(" ", 2);
                int compared = sarr1[1].compareTo(sarr2[1]);

                if(compared == 0){
                    return sarr1[0].compareTo(sarr2[0]);
                }

                return compared;
            }
        });

        llog.addAll(dlog);
        return llog.toArray(new String[0]);
    }
}