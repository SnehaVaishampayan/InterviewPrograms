class Solution {
    public int removeElement(int[] nums, int val) {
        // mainPtr .. valPtr .. 
        // if nums[valPtr ] != val.. put at mainPtr location

        int mainPtr = 0;
        int valPtr = 0;
        if(nums == null || nums.length == 0) {
            return 0;
        }
        while(valPtr < nums.length) {
            if(nums[valPtr] != val) {
                nums[mainPtr] = nums[valPtr];
                mainPtr++;                
            }
            valPtr++;
        }
        return mainPtr;
    }
}