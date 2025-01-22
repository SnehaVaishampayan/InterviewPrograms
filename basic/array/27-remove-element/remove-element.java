class Solution {
    public int removeElement(int[] nums, int val) {
// TEMPLATE : POINTERS - i (currElePtr) result (resultPtr)

        // return num of ele not equal to val
        int result = 0;
        for(int currEle : nums) {
            if(currEle != val) {
                nums[result] = currEle;
                result++;
            }
        }
        return result;
    }
}