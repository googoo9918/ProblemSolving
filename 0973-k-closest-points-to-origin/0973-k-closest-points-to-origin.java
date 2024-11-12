class Solution {
    class Point{
        int[] point;
        long distance;
        Point(int[] point, long distance){
            this.point = point;
            this.distance = distance;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>((p1,p2) ->{
            return Long.compare(p1.distance,p2.distance);
        });
        
        for(int[] point : points){
            long distance = point[0]*point[0] + point[1]*point[1];
            Point p = new Point(point, distance);
            pq.add(p);
        }

        int[][] ans = new int[k][2];
        for(int i=0; i<k; i++){
            ans[i] = pq.poll().point;
        }

        return ans;
    }
}