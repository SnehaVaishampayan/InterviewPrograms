class Solution {

// TEMPLATE : GREEDY ALGORITHM

    public boolean canJump(int[] nums) {

        int destinationIndex = nums.length - 1;

        for(int currIndex = destinationIndex - 1; currIndex >= 0 ; currIndex--) {
                
            // destinationIndex is reachable from currSteps + currIndex
            if(destinationIndex <= (currIndex + nums[currIndex]) ) {   
                destinationIndex = currIndex;           // update destinationIndex to currIndex
            }
        }
        return destinationIndex == 0;
    }
}

// 5 <= 