class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // Traverse .. 
        //     currSum + endEle
        //     while currentSum >= target.. 
        //          curSum - startEle 
        //          calc resultLen 
        //          move start

        int start = 0;
        int end = 0;
        int resultLen = Integer.MAX_VALUE;
        int currSum = 0;
        while(end < nums.length) {    //  
            System.out.println("currSum " + currSum);
            currSum = currSum + nums[end]; 
            end++;
            while(currSum >= target) {
                // calc result.. 
                resultLen = Math.min(resultLen, end-start);
                currSum = currSum - nums[start];
                start++;
            }
        }
        return resultLen  == Integer.MAX_VALUE ? 0 : resultLen;
    }
}