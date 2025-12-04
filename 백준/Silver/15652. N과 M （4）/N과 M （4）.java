import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        m = scan.nextInt();
        selected = new int[m+1];
    }

    static void rec_func(int k) {
        if (k == m + 1) { ////재귀도 결국 여러 싸이클로 나뉘는데, 한 싸이클이 끝났을 때 재귀 중간에 값을 한 번 저장하는 느낌으로 이해하자.
            for (int i = 1; i <= m; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        }else{
            for(int cand =1; cand<=n; cand++){
                if(selected[k-1]<=cand){
                    selected[k] = cand;
                    rec_func(k+1);
                    selected[k] =0;
                }
            }
        }
    }

    public static void main(String[] args) {
        input();
        rec_func(1);
        System.out.println(sb.toString());
    }

   public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
              while (st == null || !st.hasMoreElements()) {
                  try {
                     st = new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }
    }
}
