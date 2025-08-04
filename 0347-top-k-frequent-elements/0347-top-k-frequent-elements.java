import java.util.*;
class Solution {
    class Element{
        int key;
        int nums;

        Element(int key, int nums){
            this.key = key;
            this.nums = nums;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Element> pq = new PriorityQueue<>(new Comparator<Element>(){
            @Override
            public int compare(Element e1, Element e2){
                return e2.nums - e1.nums;
            }
        });

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Element e1 = new Element(entry.getKey(), entry.getValue());

            pq.add(e1);
        }

        int[] iarr = new int[k];

        for(int i=0; i<k; i++){
            iarr[i] = pq.poll().key;
        }

        return iarr;
    }
}