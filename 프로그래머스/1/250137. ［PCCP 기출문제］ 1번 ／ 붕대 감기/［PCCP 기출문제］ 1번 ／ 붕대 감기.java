import java.util.*;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int continuous = 0;
        int currentHealth = health;
        
        Map<Integer, Integer> attacksMap = new HashMap<>();
        for(int[] attack : attacks){
            attacksMap.put(attack[0], attack[1]);
        }
        
        for(int i = 1; i<=attacks[attacks.length-1][0]; i++){
            if(attacksMap.containsKey(i)){
                currentHealth -= attacksMap.get(i);
                System.out.println("1: " + currentHealth);
                if(currentHealth <= 0) return -1;
                continuous = 0;
                continue;
            }
            
            continuous++;
            
            if(continuous == bandage[0]){
                currentHealth = Math.min(health, currentHealth + bandage[1] + bandage[2]);
                continuous = 0;
                System.out.println("2: " + currentHealth);
                continue;
            }
            
            currentHealth = Math.min(health, currentHealth + bandage[1]);
            System.out.println("3: " + currentHealth);
        }
        
        return currentHealth;
    }
}