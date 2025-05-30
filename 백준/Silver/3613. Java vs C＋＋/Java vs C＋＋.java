import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if (!isValid(s)) {
            System.out.println("Error!");
            return;
        }

        if (s.indexOf('_') != -1) {
            s = convertCppToJava(s);
        } else {
            s = convertJavaToCpp(s);
        }

        System.out.println(s);
    }

    private static boolean isValid(String s) {
        if (s.startsWith("_") || s.endsWith("_")) return false;
        if (s.contains("__")) return false;
        if (Character.isUpperCase(s.charAt(0))) return false;
        if (s.contains("_") && hasUpperCase(s)) return false;
        return true;
    }

    private static boolean hasUpperCase(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }

    private static String convertCppToJava(String s) {
        StringBuilder sb = new StringBuilder();
        char[] carr = s.toCharArray();
        for (int i = 0; i < carr.length; i++) {
            if (carr[i] == '_') {
                sb.append(Character.toUpperCase(carr[i + 1]));
                i++;
            } else {
                sb.append(carr[i]);
            }
        }

        return sb.toString();
    }

    private static String convertJavaToCpp(String s) {
        StringBuilder sb = new StringBuilder();
        char[] carr = s.toCharArray();
        for (int i = 0; i < carr.length; i++) {
            if (Character.isUpperCase(carr[i])) {
                sb.append("_").append(Character.toLowerCase(carr[i]));
            } else {
                sb.append(carr[i]);
            }
        }
        return sb.toString();
    }
}
