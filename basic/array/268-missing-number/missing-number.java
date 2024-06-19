class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i: nums) {
            sum = sum + i;            
        }
        int exp = nums.length * (nums.length+1)/2;
        return exp - sum;     
    }
}