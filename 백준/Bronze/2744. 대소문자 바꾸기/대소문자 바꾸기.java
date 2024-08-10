import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String ans = "";
        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))) ans += Character.toLowerCase(s.charAt(i));
            if(Character.isLowerCase(s.charAt(i))) ans += Character.toUpperCase(s.charAt(i));
        }
    System.out.println(ans);
    }
}