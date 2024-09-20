import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long totalGames = Long.parseLong(st.nextToken());
        long wins = Long.parseLong(st.nextToken());
        
        long currentWinRate = calculateWinRate(totalGames, wins);
        
        if (currentWinRate >= 99) {
            System.out.println(-1);
            return;
        }
        
        System.out.println(binarySearch(totalGames, wins, currentWinRate));
    }
    
    private static long calculateWinRate(long totalGames, long wins) {
        return wins * 100 / totalGames;
    }
    
    private static long binarySearch(long totalGames, long wins, long currentWinRate) {
        long left = 0;
        long right = 1000000000;
        
        while (left <= right) {
            long mid = (left + right) / 2;
            long newWinRate = calculateWinRate(totalGames + mid, wins + mid);
            
            if (newWinRate > currentWinRate) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
}