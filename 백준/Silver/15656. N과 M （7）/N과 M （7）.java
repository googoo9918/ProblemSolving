import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
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

        List<Integer> list = new ArrayList<>();
        dfs(n, m, iarr, list);

        System.out.println(sb);
    }

    private static void dfs(int n, int m, int[] iarr, List<Integer> list) {
        if (list.size() == m) {
            for (int i : list) {
                sb.append(i).append(" ");
            }

            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            list.add(iarr[i]);
            dfs(n, m, iarr, list);
            list.remove(list.size() - 1);
        }
    }
}
