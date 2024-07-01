import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] sarr = myStr.split("[abc]");
        List<String> list = new ArrayList<>();
        for(int i=0; i<sarr.length; i++){
            if(!sarr[i].equals("")){
            list.add(sarr[i]);
            }
        }
        if(list.size() ==0)
        return new String[]{"EMPTY"};
        else
            return list.toArray(new String[0]);
    }
}