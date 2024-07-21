import java.util.*;
import java.io.*;
class Solution {
    public long solution(long n) {
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while(n>0){
            list.add((int)(n%10));
            n /= 10;
        }
        
        Collections.sort(list, new Comparator<Integer>(){
           @Override
           public int compare(Integer i1, Integer i2){
               return i2-i1;
           }
        });
        for(int i : list){
            sb.append(i);
        }
        return Long.parseLong(sb.toString());
    }
}