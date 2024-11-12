class Solution {
    public String removeDuplicateLetters(String s) {
        // 결국 핵심은, 순서대로 지나가면서, 어떤식으로 빼고, 어떤식으로 붙일거냐?
        // 1. 이미 사용했는가? 2. 뒤에 더 남아있는가?
        Map<Character, Integer> counter = new HashMap<>();
        Map<Character, Boolean> visited = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            counter.put(c, counter.getOrDefault(c,0)+1);
        }

        for(char c : s.toCharArray()){
            counter.put(c, counter.get(c)-1);
            if(visited.get(c)!= null && visited.get(c)==true) continue;

            while(!stack.isEmpty() && counter.get(stack.peek())>0 && stack.peek()>c){
                visited.put(stack.pop(), false);
            }
            stack.push(c);
            visited.put(c,true);
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pollLast());
        }
        return sb.toString();
    }
}