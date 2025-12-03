import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        List<Integer>[] list = new ArrayList[n+1];

        for(int i=1; i<=n; i++){
            list[i] = new ArrayList<>();
        }

        int m = Integer.parseInt(br.readLine());
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());

            list[parent].add(child);
            list[child].add(parent);
        }

        int[] distance = new int[n+1];

        System.out.println(bfs(start, end, list, distance));
    }

    static int bfs(int start, int end, List<Integer>[] list, int[] distance){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        distance[start] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if(node == end) return distance[end];
            for(int next : list[node]){
                if(distance[next] == 0 && next != node){
                    distance[next] = distance[node] + 1;
                    queue.add(next);
                }
            }
        }

        return -1;
    }
}
