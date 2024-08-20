import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] trees = new int[n];
    int max = 0;
    for(int i=0; i<n; i++){
      trees[i] = Integer.parseInt(st.nextToken());
      max = Math.max(trees[i], max);
    }

    System.out.println(binarySearch(trees, m, 0, max));
  }
  public int binarySearch(int[] trees, int target, int min, int max){
    while(min<=max){
      long sum = 0;
      int mid = min + (max - min)/2 ;
      for(int tree: trees){
        if(tree - mid>0){
          sum += tree-mid;
        }
      }
      if(sum>=target){
        min = mid+1;
      }else{
        max = mid-1;
      }
    }
    return max;
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
