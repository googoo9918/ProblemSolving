public class Main {
    public static void main(String[] args) {
        boolean[] barr = new boolean[10001]; // 0~10000, 0은 사용 안 함

        // 1. 1부터 10000까지의 i에 대해 d(i)를 한 번씩만 계산
        for (int i = 1; i <= 10000; i++) {
            int n = construct(i);   // d(i)
            if (n <= 10000) {       // 범위 안에만 표시
                barr[n] = true;     // n은 "생성된 수"이므로 셀프 넘버가 아님
            }
        }

        // 2. 한 번도 생성되지 않은 수(= 셀프 넘버)만 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if (!barr[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.print(sb);
    }

    // d(n) = n + 각 자리수의 합
    public static int construct(int n) {
        int ans = n;
        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }
}
