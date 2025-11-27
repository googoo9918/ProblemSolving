import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int max = 0;
    static int sum = 0;
    static int n;
    static boolean[] isVisited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[][] iarr = new int[n][2];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            iarr[i][0] = Integer.parseInt(st.nextToken());
            iarr[i][1] = Integer.parseInt(st.nextToken());
        }

        isVisited = new boolean[n];

        // 모든 경우의 수를 구할 수 있는가?
        // 단, idx + iarr[i][0]은 <= n 이어야 한다.
        // dfs로... idx + iarr[i][0] -1 까지 다 true 처리를 해 버리는거지.
        // 돌아갈 때는 어떻게 할건데?
        // i - iarr[i][0] + 1 을 다 false 처리하면 되지 않을까
        // start가 있는 조합이 되지 않을까?
        // dfs의 종료조건을 뭘로 설정할거임?? 굳이 설정해야할까?
        dfs(0, iarr);

        System.out.println(max);
    }

    static void dfs(int start, int[][] iarr){
        max = Math.max(max, sum);

        for(int i=start; i<n; i++){
            if(!isVisited[i] && i + iarr[i][0] <= n){
                for(int j=i; j<= i+iarr[i][0]-1; j++){
                    isVisited[j] = true;
                }

                sum += iarr[i][1];
                dfs(i+1, iarr);
                sum -= iarr[i][1];

                for(int j=i+iarr[i][0]-1; j>=i; j--){
                    isVisited[j] = false;
                }
            }
        }
    }
}
