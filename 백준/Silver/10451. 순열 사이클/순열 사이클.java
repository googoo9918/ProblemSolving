import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<Integer>[] list;
    static boolean[] isVisited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            list = new ArrayList[n+1];
            isVisited = new boolean[n+1];
            for(int j=1; j<=n; j++){
                list[j] = new ArrayList<>();
            }

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++){
                list[j].add(Integer.parseInt(st.nextToken()));
            }

            int cnt = 0;
            for(int j=1; j<=n; j++){
                if(!isVisited[j]){
                    bfs(j);
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }

    private static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        isVisited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int next : list[node]) {
                if (!isVisited[next]) {
                    queue.add(next);
                    isVisited[next] = true;
                }
            }
        }
    }
}
