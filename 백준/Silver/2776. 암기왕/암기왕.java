import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());
      int[] narr = new int[n];

      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < n; j++) {
        narr[j] = Integer.parseInt(st.nextToken());
      }

      Arrays.sort(narr);

      int m = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());

      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < m; j++) {
        int target = Integer.parseInt(st.nextToken());

        if (Arrays.binarySearch(narr, target) >= 0) {
          sb.append(1).append('\n');
        } else {
          sb.append(0).append('\n');
        }
      }

      System.out.print(sb);
    }
  }

  public static void main(String[] args) throws Exception {
    new Main().solution();
  }
}
