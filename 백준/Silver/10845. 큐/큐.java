import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    LinkedList<Integer> queue = new LinkedList<>();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String command = st.nextToken();

      switch (command) {
        case "push":
          queue.offer(Integer.parseInt(st.nextToken()));
          break;
        case "pop":
          sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
          break;
        case "size":
          sb.append(queue.size()).append("\n");
          break;
        case "empty":
          sb.append(queue.isEmpty() ? 1 : 0).append("\n");
          break;
        case "front":
          sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
          break;
        case "back":
          sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n");
          break;
      }
    }
    System.out.print(sb);
  }

  public static void main(String[] args) throws Exception {
    new Main().solution();
  }
}