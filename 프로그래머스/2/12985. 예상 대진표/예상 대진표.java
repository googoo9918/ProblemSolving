import java.util.*;
class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        while(true){
            answer++;
            if((a+1)/2 != (b+1)/2){
                a= (a+1)/2;
                b= (b+1)/2;
            }else{
                break;
            }
        }

        return answer;
    }
}