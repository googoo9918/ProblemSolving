import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        int[] left = new int[]{3,0};
        int[] right = new int[]{3,2};
        StringBuilder sb = new StringBuilder();
        for(int number : numbers){
            if(number == 1 || number == 4 || number == 7){
                sb.append("L");
                if(number ==1) left = new int[]{0,0};
                else if(number ==4) left = new int[]{1,0};
                else if(number ==7) left = new int[]{2,0};
            }else if(number == 3 || number == 6 || number == 9){
                sb.append("R");
                if(number ==3) right = new int[]{0,2};
                else if(number ==6) right = new int[]{1,2};
                else if(number ==9) right = new int[]{2,2};
            }else{
                if(number ==2){
                    int leftDistance = Math.abs(0-left[0]) + Math.abs(1-left[1]);
                    int rightDistance = Math.abs(0-right[0]) + Math.abs(1-right[1]);
                    if(leftDistance < rightDistance){
                        sb.append("L");
                        left = new int[]{0,1};
                    }else if(leftDistance > rightDistance){
                        sb.append("R");
                        right = new int[]{0,1};
                    }else{
                        if(hand.equals("left")){
                            sb.append("L");
                            left = new int[]{0,1};
                        }else{
                            sb.append("R");
                            right = new int[]{0,1};
                        }
                    }
                }
                else if(number == 5){
                    int leftDistance = Math.abs(1-left[0]) + Math.abs(1-left[1]);
                    int rightDistance = Math.abs(1-right[0]) + Math.abs(1-right[1]);
                    if(leftDistance < rightDistance){
                        sb.append("L");
                        left = new int[]{1,1};
                    }else if(leftDistance > rightDistance){
                        sb.append("R");
                        right = new int[]{1,1};
                    }else{
                        if(hand.equals("left")){
                            sb.append("L");
                            left = new int[]{1,1};
                        }else{
                            sb.append("R");
                            right = new int[]{1,1};
                        }
                    }
                }
                else if(number == 8){
                    int leftDistance = Math.abs(2-left[0]) + Math.abs(1-left[1]);
                    int rightDistance = Math.abs(2-right[0]) + Math.abs(1-right[1]);
                    if(leftDistance < rightDistance){
                        sb.append("L");
                        left = new int[]{2,1};
                    }else if(leftDistance > rightDistance){
                        sb.append("R");
                        right = new int[]{2,1};
                    }else{
                        if(hand.equals("left")){
                            sb.append("L");
                            left = new int[]{2,1};
                        }else{
                            sb.append("R");
                            right = new int[]{2,1};
                        }
                    }
                }
                else if(number == 0){
                    int leftDistance = Math.abs(3-left[0]) + Math.abs(1-left[1]);
                    int rightDistance = Math.abs(3-right[0]) + Math.abs(1-right[1]);
                    if(leftDistance < rightDistance){
                        sb.append("L");
                        left = new int[]{3,1};
                    }else if(leftDistance > rightDistance){
                        sb.append("R");
                        right = new int[]{3,1};
                    }else{
                        if(hand.equals("left")){
                            sb.append("L");
                            left = new int[]{3,1};
                        }else{
                            sb.append("R");
                            right = new int[]{3,1};
                        }
                    }
                }
            }
        }
        
        return sb.toString();
    }
}