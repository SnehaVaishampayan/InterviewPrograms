class Solution {
    public int majorityElement(int[] nums) {
        // create a hashmap .. mapping element -> count
        //      track values while adding in map.. 
        //      if value > nums.length / 2 return ele 

        Map<Integer, Integer> hm = new HashMap<>();
        for(int i: nums) {
            if(hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);                                
            }
            else {
                hm.put(i, 1);
            }
            if(hm.get(i) > nums.length / 2) {
                return i;
            }
        }
        return nums[0];
    }
}