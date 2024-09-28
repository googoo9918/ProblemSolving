import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  int n, d, k, c;
  int[] iarr;
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    d = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());
    iarr = new int[n+k-1];
    for(int i=0; i<n; i++){
      iarr[i] = Integer.parseInt(br.readLine());
    }
    for (int i = n; i < iarr.length; i++) {
      iarr[i] = iarr[i-n];
    }

    HashMap<Integer, Integer> hash = new HashMap<>();
    int cnt = 0, max = 0, left=0, right=k;
    for(int i=0; i<k; i++){
      hash.put(iarr[i], hash.getOrDefault(iarr[i], 0)+1);
    }
    cnt = hash.size();
    if(!hash.containsKey(c)) cnt++;
    max = cnt;
    while (right != iarr.length) {
      hash.put(iarr[left], hash.get(iarr[left])-1);
      if(hash.get(iarr[left])==0){
        hash.remove(iarr[left]);
      }
      hash.put(iarr[right], hash.getOrDefault(iarr[right],0)+1);
      left++; right++;
      cnt = hash.size();
      if(!hash.containsKey(c)) cnt++;
      max = Math.max(max,cnt);
    }
    System.out.println(max);
  }

  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
