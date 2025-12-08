import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m;
    static int[] iarr;
    static List<Integer> list = new ArrayList<>();
    static Set<String> set = new LinkedHashSet<>();
    static boolean[] isVisited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        iarr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int next = Integer.parseInt(st.nextToken());
            iarr[i] = next;
        }

        isVisited = new boolean[n + 1];

        Arrays.sort(iarr);

        dfs();

        for (String s : set) {
            System.out.println(s);
        }
    }

    private static void dfs() {
        if (list.size() == m) {
            StringBuilder sb = new StringBuilder();
            for (int i : list) {
                sb.append(i).append(" ");
            }
            set.add(sb.toString());
        }

        for (int i = 1; i <= n; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                list.add(iarr[i]);
                dfs();
                list.remove(list.size() - 1);
                isVisited[i] = false;
            }
        }
    }
}
