class Solution {
    public int maxArea(int[] height) {
        int maxResultArea = 0;//Integer.MIN_VALUE;
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