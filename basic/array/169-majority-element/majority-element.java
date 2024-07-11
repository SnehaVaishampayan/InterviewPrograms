class Solution {
    public int majorityElement(int[] nums) {
        // hashmap with element - count
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i: nums) {
            if(hm.containsKey(i)) {
                hm.put(i,hm.get(i)+1);
            }
            else {
                hm.put(i, 1);
            }
        }
        System.out.println("df " + hm);
        int maxCount = 0;
        int res = nums[0];
        for(Map.Entry<Integer, Integer> e: hm.entrySet()) {
            if(maxCount < e.getValue()) {
                res = e.getKey();
                maxCount = e.getValue();
            }
        }
        return res;
    }
}