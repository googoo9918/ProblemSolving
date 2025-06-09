import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        // idx 저장(idxMap)
        Map<String, Integer> idxMap = new HashMap<>();
        //이름 / int[]
        Map<String, int[]> giftMap = new HashMap<>();
        for(int i=0; i<friends.length; i++){
            idxMap.put(friends[i], i);
            giftMap.put(friends[i], new int[3]);
        }
        
        //주고받은 선물 횟수 저장 + 선물 지수 저장
        //그런데 사실 선물 지수라는건, 어차피 준 선물과 받은 선물을 통해 구해지는 것이므로...
        //그냥 일차원 배열에 저장해도 될 듯 함.\
        //giftMap도 아니라 그냥 int[]에 저장하면 되지 않을까 싶음.
        int[][] giftArr = new int[friends.length][friends.length];
        for(String gift : gifts){
            String[] giftSplit = gift.split(" ");
            giftArr[idxMap.get(giftSplit[0])][idxMap.get(giftSplit[1])]++;
            
            // 준 선물 횟수 추가
            int[] tmp = giftMap.get(giftSplit[0]);
            tmp[0]++;
            //선물 지수 수정
            tmp[2] = tmp[0] - tmp[1];
            giftMap.put(giftSplit[0], tmp);
            
            // 받은 선물 횟수 추가
            int[] tmp2 = giftMap.get(giftSplit[1]);
            tmp2[1]++;
            //선물 지수 수정
            tmp2[2] = tmp2[0] - tmp2[1];
            giftMap.put(giftSplit[1], tmp2);
        }
        
        // 다음달에 받을 선물
        // if) 선물 주고 받은 기록 있을 경우 -> 더 많은 선물을 준 사람이 하나 받기
        // 기록이 하나도 없거나 / 주고받은 수가 같을 때 -> 선물 지수가 더 큰 사람이 작은 사람한테 받기
        // 선물지수까지 같다면 --> 선물을 주고받지 않음
        int[] ansCan = new int[friends.length];
        for(int i=0; i<giftArr.length; i++){
            for(int j=i; j<giftArr.length; j++){
                if(i==j) continue;
                
                boolean flag = giftArr[i][j] != 0 || giftArr[j][i] != 0; 
                if(flag && giftArr[i][j] > giftArr[j][i]){
                    ansCan[i]++;   
                }else if(flag && giftArr[i][j] < giftArr[j][i]){
                    ansCan[j]++;
                }else if(!flag || (flag && giftArr[i][j] == giftArr[j][i])){
                    int i1 = giftMap.get(friends[i])[2];
                    int i2 = giftMap.get(friends[j])[2];
                    
                    if(i1 < i2) ansCan[j]++;
                    else if(i1 > i2) ansCan[i]++;
                }
            }
        }
        
        int ans = 0;
        for(int i : ansCan){
            ans = Math.max(ans, i);
        }
        return ans;
    }
}