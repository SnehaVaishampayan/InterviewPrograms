class Solution {
    public void moveZeroes(int[] nums) {
        int mainPtr = 0; int zeroPtr = 0;
        if(nums == null || nums.length == 0) {
            return ;
        }
        while(zeroPtr < nums.length) {
            if(nums[zeroPtr] != 0) {
                nums[mainPtr] = nums[zeroPtr];
                mainPtr++;
            }
            zeroPtr++;
        }
        while(mainPtr < nums.length) {
            nums[mainPtr] = 0;
            mainPtr++;
        }
    }
}