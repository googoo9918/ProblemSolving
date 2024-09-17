import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] narr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());

    for(int i=0; i<n; i++){
      narr[i] = Integer.parseInt(st.nextToken());
    }

    Set<Integer> narrCopy = new HashSet<>();
    for(int i: narr){
      narrCopy.add(i);
    }
    List<Integer> narrCopyList = new ArrayList<>();
    for(int i: narrCopy){
      narrCopyList.add(i);
    }
    Collections.sort(narrCopyList);
    StringBuilder sb = new StringBuilder();

    for(int i : narr){
      sb.append(Collections.binarySearch(narrCopyList, i)).append(" ");
    }

    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
