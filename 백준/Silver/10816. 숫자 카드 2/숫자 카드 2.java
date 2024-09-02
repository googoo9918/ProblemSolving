import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for(int i=0; i<n; i++){
      int tmp = Integer.parseInt(st.nextToken());
      hashMap.put(tmp, hashMap.getOrDefault(tmp, 0) + 1);
    }
    StringBuilder sb = new StringBuilder();
    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<m; i++){
      sb.append(hashMap.getOrDefault(Integer.parseInt(st.nextToken()),0)).append(" ");
    }

    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
