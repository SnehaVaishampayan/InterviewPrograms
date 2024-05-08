class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>  hm = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(hm.containsKey(target - nums[i]) ) {
                result[0] = i;
                result[1] = hm.get(target - nums[i]);
            }
            else {
                hm.put(nums[i], i);
            }
        }
        return result;
    }
}