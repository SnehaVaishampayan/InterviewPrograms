class Solution {

// TEMPLATE : GREEDY ALGORITHM

    public boolean canJump(int[] nums) {

        int lastStepIndex = nums.length - 1;

        for(int i = lastStepIndex - 1; i >= 0 ; i--) {

            if(lastStepIndex <= (nums[i] + i) ) { 
                lastStepIndex = i;
            }
        }
        return lastStepIndex == 0;
    }
}