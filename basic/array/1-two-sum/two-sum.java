class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        // Validations 
        if(nums == null || nums.length == 0) {
            return result;
        }

        Map<Integer, Integer> hm = new HashMap<>();
        // hashmap -> target-curr , currIndex

        for(int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])) {
                result[0] = hm.get(nums[i]);
                result[1] = i;
                return result;
            }
            else {
                hm.put(target-nums[i], i);
            }
        }
        return result;


    }
}