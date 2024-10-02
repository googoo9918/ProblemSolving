import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
  int K;
  int[] tree;
  ArrayList<Integer>[] arrayList;
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    K = Integer.parseInt(br.readLine());
    tree = new int[(1<<K)-1];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<tree.length; i++){
      tree[i] = Integer.parseInt(st.nextToken());
    }
    arrayList = new ArrayList[K];
    for(int i=0; i<K; i++){
      arrayList[i] = new ArrayList<>();
    }

    inOrder(0, tree.length-1, 0);
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<K; i++){
      for(int tmp : arrayList[i]){
        sb.append(tmp).append(" ");
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }

  private void inOrder(int start, int end, int level) {
    if(start>end) return;

    int mid = (start+end)/2;
    arrayList[level].add(tree[mid]);
    inOrder(start, mid-1, level+1);
    inOrder(mid+1, end, level+1);
  }

  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
