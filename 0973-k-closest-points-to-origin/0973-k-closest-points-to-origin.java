class Solution {
    class Point implements Comparable<Point>{
        Point(int x, int y){
            this.x = x;
            this.y = y;
            this.distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2)); 
        }
        int x;
        int y;
        double distance;

        @Override
        public int compareTo(Point other){
            return Double.compare(this.distance, other.distance);
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int[] iarr : points){
            Point p = new Point(iarr[0], iarr[1]);
            pq.add(p);
        }

        int[][] ans = new int[k][2];
        for(int i=0; i<k; i++){
            ans[i][0] = pq.peek().x;
            ans[i][1] = pq.poll().y;
        }

        return ans;
    }
}