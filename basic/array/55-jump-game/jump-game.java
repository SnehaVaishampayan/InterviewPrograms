class Solution {

// TEMPLATE : GREEDY ALGORITHM

    public boolean canJump(int[] nums) {

        // start from last
        //  if 
        int lastStepIndex = nums.length - 1;

        for(int i = lastStepIndex - 1; i >= 0 ; i--) {
            System.out.println("last " + lastStepIndex);
            if(lastStepIndex <= (nums[i] + i) ) { // 
                System.out.println("(nums[i] + i) " + (nums[i] + i));
                lastStepIndex = i;
            }
        }
        return lastStepIndex == 0;
    }
}