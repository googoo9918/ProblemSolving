class Solution {
    public int solution(int n, int w, int num) {
        int[][] boxes = new int[n/w+1][w];
        
        boolean flag =true;
        int boxNum = 1;
        int dx =0, dy=0;
        for(int i=0; i<n/w; i++){
            if(flag){
                for(int j=0; j<w; j++){
                    boxes[i][j] = boxNum++;
                    if(num == boxes[i][j]){
                        dx = i;
                        dy = j;
                    }
                }
                flag = false;
            }else{
                for(int j=w-1; j>=0; j--){
                    boxes[i][j] = boxNum++;
                    if(num == boxes[i][j]){
                        dx = i;
                        dy = j;
                    }
                }
                flag = true;
            }
        }
        
        if(flag){
            for(int j=0; j<n%w; j++){
                boxes[n/w][j] = boxNum++;
                if(num == boxes[n/w][j]){
                    dx = n/w;
                    dy = j;
                }
            }
        }else{
            for(int j=w-1; j>=w-n%w; j--){
                boxes[n/w][j] = boxNum++;
                if(num == boxes[n/w][j]){
                    dx = n/w;
                    dy = j;
                }
            }
        }
        int ans = 0;
        for(int i=dx; i < n/w+1; i++){
            if(boxes[i][dy] != 0) ans++;
        }
        return ans;
    }
}