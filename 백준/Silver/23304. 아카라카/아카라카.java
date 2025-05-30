import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean flag = isAkaraka(s);
        if (flag) System.out.println("AKARAKA");
        else System.out.println("IPSELENTI");
    }

    private static boolean isAkaraka(String s) {
        if (s.length() <= 1) return true;

        StringBuilder sb = new StringBuilder(s);
        if (!s.equals(sb.reverse().toString())) return false;

        int mid = s.length() / 2;
        String left = s.substring(0, mid);
        String right = s.substring(s.length() - mid);

        return isAkaraka(left) && isAkaraka(right);
    }
}
