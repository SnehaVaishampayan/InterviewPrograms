class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // traverse points
        //      calc distance
        //      add in PriorityQueue
        //      maintain pq size <= k
        //  poll pq until empty into result 
        // return result 

        PriorityQueue<PointObj> pq= new PriorityQueue<PointObj> (new PointObjComparator());

        for(int[] p: points) {
            pq.add(new PointObj(p[0], p[1], getEuclideanDistance(p[0], p[1])));
            while(pq.size() > k) {
                pq.poll();
            }
        }
        int[][] result = new int[pq.size()][2];
        int r = 0; 
        while(!pq.isEmpty()) {
            PointObj p = pq.poll();
            result[r][0] = p.x; result[r][1] = p.y;
            r++;
        }
        return result;

    }

    public double getEuclideanDistance(int x, int y) {
        int sum = (x*x) + ( y * y);
        return (double) Math.sqrt(sum);
    }

}

class PointObjComparator implements Comparator<PointObj> {

    @Override
    public int compare(PointObj p1, PointObj p2) {
        if(p1.d < p2.d) {
            return 1;            
        }
        else if( p1.d > p2.d) {
            return -1;
        }
        else {
            return 0;
        }
    }
}

class PointObj {
    int x; int y; double d;
    public PointObj(int x, int y, double d) {
        this.x = x; this.y = y; this.d = d;
    }
}