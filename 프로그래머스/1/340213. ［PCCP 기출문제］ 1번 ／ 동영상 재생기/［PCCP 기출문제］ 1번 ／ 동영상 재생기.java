import java.util.*;


class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] posArr = pos.split(":");
        String[] startArr = op_start.split(":");
        String[] endArr = op_end.split(":");
        String[] videoArr = video_len.split(":");
        
        for(String command : commands){
            if(Integer.parseInt(posArr[0]) * 60 + Integer.parseInt(posArr[1]) >= Integer.parseInt(startArr[0]) * 60 + Integer.parseInt(startArr[1]) &&
               Integer.parseInt(posArr[0]) * 60 + Integer.parseInt(posArr[1]) <= Integer.parseInt(endArr[0]) * 60 + Integer.parseInt(endArr[1]))
            {
                posArr[0] = endArr[0];
                posArr[1] = endArr[1];
            }
            
            int posH = Integer.parseInt(posArr[0]);
            int posM = Integer.parseInt(posArr[1]);
            int videoH = Integer.parseInt(videoArr[0]);
            int videoM = Integer.parseInt(videoArr[1]);
            
            if(command.equals("next")){
                if(posM + 10 < 60){
                    if(posH == videoH && posM + 10 >= videoM){
                        posArr[0] = String.valueOf(videoH);
                        posArr[1] = String.valueOf(videoM);
                        continue;
                    }
                    posArr[1] = String.valueOf(posM+10);
                }else{
                    if(posH+1 == videoH && (posM+10)%60 >= videoM){
                        posArr[0] = String.valueOf(videoH);
                        posArr[1] = String.valueOf(videoM);
                        continue;
                    }
                    posArr[0] = String.valueOf(posH+1);
                    posArr[1] = String.valueOf((posM+10)%60);
                }
            }else{
                if(posM - 10 < 0){
                    if(posH == 0){
                        posArr[0] = String.valueOf(0);
                        posArr[1] = String.valueOf(0);
                        continue;
                    }
                    posArr[0] = String.valueOf(posH-1);
                    posArr[1] = String.valueOf(posM+50);
                } else{
                    posArr[1] = String.valueOf(posM-10);
                }
            }
            
            if(Integer.parseInt(posArr[0]) * 60 + Integer.parseInt(posArr[1]) >= Integer.parseInt(startArr[0]) * 60 + Integer.parseInt(startArr[1]) &&
               Integer.parseInt(posArr[0]) * 60 + Integer.parseInt(posArr[1]) <= Integer.parseInt(endArr[0]) * 60 + Integer.parseInt(endArr[1]))
            {
                posArr[0] = endArr[0];
                posArr[1] = endArr[1];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        if(posArr[0].length() == 1){
            sb.append(0).append(posArr[0]);
        }else{
            sb.append(posArr[0]);
        }
        sb.append(":");
        if(posArr[1].length() == 1){
            sb.append(0).append(posArr[1]);
        }else{
            sb.append(posArr[1]);
        }
        
        return sb.toString();
    }
}