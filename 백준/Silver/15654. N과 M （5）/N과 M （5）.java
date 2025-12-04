import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] iarr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            iarr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(iarr);

        boolean[] isVisited = new boolean[n + 1];
        List<Integer> list = new ArrayList<>();
        dfs(n, m, iarr, list, isVisited);
    }

    private static void dfs(int n, int m, int[] iarr, List<Integer> list, boolean[] isVisited) {
        if (list.size() == m) {
            StringBuilder sb = new StringBuilder();
            for (int i : list) {
                sb.append(i).append(" ");
            }

            System.out.println(sb);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                list.add(iarr[i]);
                dfs(n, m, iarr, list, isVisited);
                list.remove(list.size() - 1);
                isVisited[i] = false;
            }
        }
    }
}
