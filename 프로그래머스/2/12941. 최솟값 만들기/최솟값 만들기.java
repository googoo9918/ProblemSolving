import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        List<Integer> alist = new ArrayList<>();
        List<Integer> blist = new ArrayList<>();
        
        for(int i=0; i<A.length; i++){
            alist.add(A[i]);
            blist.add(B[i]);
        }
        
        Collections.sort(alist);
        Collections.sort(blist, Collections.reverseOrder());
        
        for(int i=0; i<alist.size(); i++){
            answer += alist.get(i) * blist.get(i);
        }

        return answer;
    }
}