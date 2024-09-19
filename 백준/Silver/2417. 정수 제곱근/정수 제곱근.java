import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public void solution() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(br.readLine());
    System.out.println(findRoot(n));
  }

  private long findRoot(long n) {
    if (n == 0) return 0;

    long left = 0;
    long right = n;
    long answer = 0;

    while (left <= right) {
      long mid = left + (right - left) / 2;
      double midSquared = Math.pow(mid, 2);

      if (midSquared >= n) {
        answer = mid;
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return answer;
  }

  public static void main(String[] args) throws Exception {
    new Main().solution();
  }
}
