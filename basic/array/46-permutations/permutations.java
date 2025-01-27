class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        recursive_permutation(nums, 0, result);
        return result;
    }

    void recursive_permutation(int[] nums, int itr, List<List<Integer>> result) {
        if(itr == nums.length) {
            List<Integer> subResult = new ArrayList<>();
            for(int i: nums) {
                subResult.add(i);
            }
            result.add(subResult);
        }
        for(int i = itr; i < nums.length; i++) {
            swap(nums, itr, i);
            recursive_permutation(nums, itr+1, result);
            swap(nums, i, itr);
        }
    }
    void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}