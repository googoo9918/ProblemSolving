import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m, cnt;
    static List<Integer>[] list;
    static boolean[] isVisited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        list = new ArrayList[n + 1];
        isVisited = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            list[start].add(end);
            list[end].add(start);
        }

        bfs(1);

        System.out.println(isVisit());
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        isVisited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int next : list[node]) {
                if (!isVisited[next]) {
                    isVisited[next] = true;
                    queue.add(next);
                }
            }
        }
    }

    private static int isVisit(){
        int cnt =0;
        for (boolean b : isVisited) {
            if(b) cnt++;
        }

        return cnt-1;
    }
}
