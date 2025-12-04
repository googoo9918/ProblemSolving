import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static boolean[] isVisited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        isVisited = new boolean[n + 1];
        List<Integer> list = new ArrayList<>();

        dfs(n, m, list, 1);
    }

    private static void dfs(int n, int m, List<Integer> list, int start) {
        if (list.size() == m) {
            StringBuilder sb = new StringBuilder();
            for (int i : list) {
                sb.append(i).append(" ");
            }

            System.out.println(sb);
            return;
        }
        for (int i = start; i <= n; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                list.add(i);
                dfs(n, m, list, i + 1);
                list.remove(list.size() - 1);
                isVisited[i] = false;
            }
        }
    }
}
