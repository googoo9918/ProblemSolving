import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] cost;
    static boolean[] isVisited;
    static int n, sum = 0, min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        cost = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        isVisited = new boolean[n];

        for (int i = 0; i < n; i++) {
            isVisited[i] = true;
            dfs(i, 1, i);
            isVisited[i] = false;
        }

        System.out.println(min);
    }

    private static void dfs(int start, int depth, int startPath) {
        if (sum >= min) {
            return;
        }

        if (depth == n) {
            if (cost[start][startPath] != 0) {
                min = Math.min(sum + cost[start][startPath], min);
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!isVisited[i] && cost[start][i] != 0) {
                isVisited[i] = true;
                sum += cost[start][i];
                dfs(i, depth + 1, startPath);
                sum -= cost[start][i];
                isVisited[i] = false;
            }
        }
    }
}
