import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch(s){
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(deque.size()==0 ? -1 : deque.removeFirst()).append("\n");
                    break;
                case "pop_back":
                    sb.append(deque.size()==0 ? -1 : deque.removeLast()).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");              
                    break;
                case "empty":
                    sb.append(deque.size()==0 ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(deque.size()==0 ? -1 : deque.getFirst()).append("\n");
                    break;
                case "back":
                    sb.append(deque.size()==0 ? -1 : deque.getLast()).append("\n");
                    break;           
            }
        }
        System.out.println(sb);
    }
}