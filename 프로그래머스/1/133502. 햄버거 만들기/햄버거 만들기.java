class Solution {
    public int solution(int[] ingredient) {
        int[] ingredientArr = new int[ingredient.length];
        
        int idx = 0, ans = 0; 
        for(int i : ingredient){
            ingredientArr[idx++] = i;
            
            if(idx>=4 && ingredientArr[idx-1] == 1 && ingredientArr[idx-2] == 3 && ingredientArr[idx-3] == 2 && ingredientArr[idx-4] == 1){
                idx -= 4;
                ans++;
            }
        }
        
        return ans;
    }
}