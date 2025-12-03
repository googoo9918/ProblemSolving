import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int t, m, n, k, cnt=0;
    static int[][] ground;
    static int[] dx = new int[]{1,-1,0,0};
    static int[] dy = new int[]{0,0,1,-1};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); // 가로
            n = Integer.parseInt(st.nextToken()); // 세로
            k = Integer.parseInt(st.nextToken());
            ground = new int[n][m];
            for(int j=0; j<k; j++){
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                ground[x][y] = 1;
            }

            for(int i1=0; i1<n; i1++){
                for(int j1=0; j1<m; j1++){
                    if(ground[i1][j1] == 1){
                        dfs(i1, j1);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
            cnt = 0;
        }
    }

    private static void dfs(int x, int y){
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && ny >= 0 && nx < n && ny < m && ground[nx][ny] == 1){
                ground[nx][ny] = 0;
                dfs(nx, ny);
            }
        }
    }
}
