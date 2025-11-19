import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static boolean found = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] iarr = new int[9];

        for (int i = 0; i < 9; i++) {
            iarr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        List<Integer> list = new ArrayList<>();
        dfs(sum, iarr, list, 0);
    }

    private static void dfs(int sum, int[] iarr, List<Integer> list, int start) {
        if (found) return;

        if (list.size() == 7) {
            if (sum == 100) {
                Collections.sort(list);
                StringBuilder sb = new StringBuilder();
                for (int i : list) {
                    sb.append(i).append("\n");
                }
                
                found = true;
                System.out.println(sb);
            }
            return;
        }

        for (int i = start; i < iarr.length; i++) {
            list.add(iarr[i]);
            dfs(sum + iarr[i], iarr, list, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
