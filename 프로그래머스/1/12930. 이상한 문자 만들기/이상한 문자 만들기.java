class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isEven = true;
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(c);
                isEven = true;
            } else {
                if (isEven) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                isEven = !isEven;
            }
        }
        
        return answer.toString();
    }
}