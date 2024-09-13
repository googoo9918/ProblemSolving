import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  // k: 부등호 문자의 개수
  private static int k;
  // signs: 부등호를 저장하는 문자 배열
  private static char[] signs;
  // used: 숫자의 사용 여부를 체크하는 배열 (0부터 9까지)
  private static boolean[] used = new boolean[10];
  // min, max: 조건을 만족하는 최소값과 최대값
  private static String min = "9999999999", max = "0";

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 부등호의 개수 입력 받기
    k = Integer.parseInt(br.readLine());
    // 부등호 문자열을 입력 받아 공백을 제거하고 문자 배열로 변환
    signs = br.readLine().replace(" ", "").toCharArray();

    // 백트래킹 함수 호출
    backtrack(0, new StringBuilder());

    // 결과 출력
    System.out.println(max);
    System.out.println(min);
  }

  private static void backtrack(int depth, StringBuilder current) {
    // 모든 숫자를 선택했을 때 (k+1개의 숫자)
    if (depth == k + 1) {
      String result = current.toString();
      // 최소값, 최대값 갱신
      if (result.compareTo(min) < 0) min = result;
      if (result.compareTo(max) > 0) max = result;
      return;
    }

    // 0부터 9까지의 숫자에 대해 탐색
    for (int i = 0; i <= 9; i++) {
      // 이미 사용한 숫자면 건너뛰기
      if (used[i]) continue;

      // 첫 번째 숫자가 아닐 경우, 부등호 조건 확인
      if (depth > 0) {
        char prevDigit = current.charAt(depth - 1);
        // 부등호 조건을 만족하지 않으면 건너뛰기
        if (signs[depth - 1] == '<' && prevDigit >= (char) (i + '0')) continue;
        if (signs[depth - 1] == '>' && prevDigit <= (char) (i + '0')) continue;
      }

      // 숫자 사용 표시
      used[i] = true;
      // 현재 숫자를 문자열에 추가
      current.append(i);
      // 다음 깊이로 재귀 호출
      backtrack(depth + 1, current);
      // 백트래킹: 숫자 사용 해제 및 문자열에서 제거
      used[i] = false;
      current.setLength(current.length() - 1);
    }
  }
}