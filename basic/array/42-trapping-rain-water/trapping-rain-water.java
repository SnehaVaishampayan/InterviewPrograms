class Solution {
    public int trap(int[] height) {

        if(height == null || height.length == 0) {
            return 0;
        }
        int[] left = new int[height.length];
        int[] right = new int[height.length];

        
        // Traverse left to right
        int currLeftMax = height[0];
        left[0] = height[0];
        for(int i = 1; i < height.length; i++) {            
            currLeftMax = Math.max(height[i], currLeftMax);   
            left[i] = currLeftMax;         
        }
        // Traverse right to left 
        int currRightMax = height[height.length-1];
        right[height.length-1] = height[height.length-1];
        for(int i = height.length - 2; i >= 0 ; i--) {
            currRightMax = Math.max(currRightMax, height[i]);
            right[i] = currRightMax;
        }
        int result = 0;
        for(int i = 0; i < height.length; i++) {
            result += Math.min(left[i],right[i]) - height[i];
        }
        return result;







        //  p1 0 p2  1
        //  if p1 < p2.. no water
        //  if p1 > p2 .. diff+ .. move only p2 
        //  .. move 
        //  0 1 0
        //  1 0 1 p2small
        //  1 2 0
        //  0 1 0
        //  2 0 
        //  4 2 2 p2small
        //  4 0 +4 p2small
        //  4 3 +1 p2small
        //  4 2 +2 p2small
        //  4 5 0 



    }
}