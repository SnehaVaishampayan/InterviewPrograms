class Solution {
    public int maxArea(int[] height) {

        // TEMPLATE TWO PTRS - leftPtr / rightPtr
        //  Traversing from both ends 
        //      calc currArea and get maxArea
        //      int currArea = (rightPtr-leftPtr) * Math.min(height[leftPtr], height[rightPtr]);
        //      get  maxResultArea = MAX of maxResultArea, currArea
        //      move smaller of height[leftPtr], height[rightPtr]

        
        int maxResultArea = 0;
        if(height == null || height.length == 0) {
            return 0;
        }
        int leftPtr = 0;
        int rightPtr = height.length-1;;
        while(leftPtr < rightPtr) {
            // calc currArea and get maxArea
            int currArea = (rightPtr-leftPtr) * Math.min(height[leftPtr], height[rightPtr]);
           
            maxResultArea = Math.max(maxResultArea, currArea);
            if(height[leftPtr] < height[rightPtr]) {
                leftPtr++;
            }
            else{
                rightPtr--;
            }
        }
        return maxResultArea;
    }
}