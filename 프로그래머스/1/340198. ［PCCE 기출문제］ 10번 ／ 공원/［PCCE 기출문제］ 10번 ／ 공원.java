import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int ans = -1;
        for(int mat : mats){
            for(int i=0; i<=park.length - mat; i++){
                for(int j=0; j<=park[0].length - mat; j++){
                    boolean flag = true;
                    for(int k=i; k<i+mat; k++){
                        for(int l=j; l<j+mat; l++){
                            if(!park[k][l].equals("-1")){
                                flag = false;
                                break;
                            }
                        }
                        if(!flag) break;
                    }
                    if(flag) ans = Math.max(mat, ans);
                }
            }
        }
        return ans;
    }
}