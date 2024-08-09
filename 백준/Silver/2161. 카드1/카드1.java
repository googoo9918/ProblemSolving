import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        while(queue.size()>0){
            sb.append(queue.poll()).append(' ');
            if(queue.size()==0) break;
            
            queue.add(queue.poll());
        }
        System.out.println(sb);
    }
}