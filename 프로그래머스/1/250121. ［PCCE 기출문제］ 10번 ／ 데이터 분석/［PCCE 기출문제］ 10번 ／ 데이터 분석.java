import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int idx = 0;
        if(ext.equals("date")) idx =1;
        else if(ext.equals("maximum")) idx =2;
        else if(ext.equals("remain")) idx =3;
        
        List<int[]> list = new ArrayList<>();
        for(int[] iarr : data){
            if(iarr[idx] < val_ext){
                list.add(iarr);
            }
        }

        int[][] answer = new int[list.size()][4];

        final int idx2;
        if(sort_by.equals("date")) idx2 =1;
        else if(sort_by.equals("maximum")) idx2 =2;
        else if(sort_by.equals("remain")) idx2 =3;
        else idx2 = 0; 
        
        Collections.sort(list, (il1, il2) -> il1[idx2] - il2[idx2]);
        
        int idx3 = 0;
        for(int[] iarr : list){
            answer[idx3++] = iarr;
        }
        return answer;
    }
}