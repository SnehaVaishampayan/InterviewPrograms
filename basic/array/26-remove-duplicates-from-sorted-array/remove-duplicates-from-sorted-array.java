class Solution {
    public int removeDuplicates(int[] nums) {
        // Given -> non decreasing, increasing sorted order
        // in-place solution
        // return count of unque elements

        // Traverse -> if we see runnerPtr == mainPtr, runnerPTr++

        if(nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return 1;
        }

        int mainPtr = 0; int runnerPtr = 1;
        while(runnerPtr < nums.length) {
            if(nums[runnerPtr] == nums[mainPtr]) {                
                runnerPtr++;
            }
            else {
                mainPtr++;
                nums[mainPtr] = nums[runnerPtr];
                runnerPtr++;
            }
        }
        return mainPtr+1;
    }
}