class Solution {
    class Num{
        int num;
        int cnt;
        Num(int num, int cnt){
            this.num = num;
            this.cnt = cnt;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Num> pq = new PriorityQueue<>((n1, n2) -> {
            return Integer.compare(n2.cnt,n1.cnt);
        });
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Num n = new Num(entry.getKey(), entry.getValue());
            pq.add(n);
        }

        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = pq.poll().num;
        }
        return ans;
    }
}