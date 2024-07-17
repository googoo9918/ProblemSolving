import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Set<String> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      set.add(br.readLine());
    }

    List<String> list = new ArrayList<>(set);

    Collections.sort(list, new Comparator<String>() {
          @Override
          public int compare(String s1, String s2) {
            if (s1.length() == s2.length()) {
              return s1.compareTo(s2);
            }
            return s1.length() - s2.length();
          }
        }
      );

    for(String s: list){
      System.out.println(s);
    }
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
