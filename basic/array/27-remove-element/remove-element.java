class Solution {
    public int removeElement(int[] nums, int val) {
        // return num of ele not equal to val
        int result = 0;
        
        for(int i: nums) {
            if(i != val) {
                nums[result] = i;
                result++;
            }
        }
        return result;
    }
}