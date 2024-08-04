class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possible = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) {
            if (canPronounce(word, possible)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean canPronounce(String word, String[] possible) {
        String prev = "";
        while (!word.isEmpty()) {
            boolean found = false;
            for (String sound : possible) {
                if (word.startsWith(sound) && !sound.equals(prev)) {
                    word = word.substring(sound.length());
                    prev = sound;
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}