class Solution {
    public boolean increasingTriplet(int[] nums) {
        boolean result = false;
        int smallerNum = Integer.MAX_VALUE;
        int midNum = Integer.MAX_VALUE;
        for(int currNum: nums) {
            if(currNum <= smallerNum) {
                smallerNum = currNum;
            }
            else if(currNum <= midNum) {
                midNum = currNum;
            }
            else {
                return true;
            }
        }
        return false;

    }
}