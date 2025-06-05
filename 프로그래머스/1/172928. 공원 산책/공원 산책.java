import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        List<Integer> list = new ArrayList<>();
        int dx=0, dy=0;
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[0].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    dx = i;
                    dy = j;
                }
            }
        }
        
        for(String route : routes){
            String[] routeArr = route.split(" ");
            String op = routeArr[0];
            int len = Integer.parseInt(routeArr[1]);
            boolean flag = true;
            if(op.equals("N")){
                if(dx - len < 0) continue;   
                for(int i=dx; i>=dx-len; i--){
                    if(park[i].charAt(dy) == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    dx -= len;
                }
            }else if(op.equals("S")){
                if(dx + len >= park.length) continue;
                for(int i=dx; i<=dx+len; i++){
                    if(park[i].charAt(dy) == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    dx += len;
                }
            }else if(op.equals("W")){
                if(dy - len < 0) continue;
                for(int i=dy; i>=dy-len; i--){
                    if(park[dx].charAt(i) == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    dy -= len;
                }
            }else if(op.equals("E")){
                if(dy + len >= park[0].length()) continue;
                for(int i=dy; i<=dy+len; i++){
                    if(park[dx].charAt(i) == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    dy += len;
                }
            }
            System.out.println("dx: " + dx + " dy: " + dy);
        }
        
        return new int[]{dx,dy};
    }
}