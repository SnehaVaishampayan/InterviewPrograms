class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return result;
        }
        
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i: nums) {
            if(hm.containsKey(i)) {
                hm.put(i, hm.get(i)+1);
            }
            else {
                hm.put(i, 1);
            }
        }
        for(Map.Entry<Integer,Integer> e: hm.entrySet()) {
            if(e.getValue() > (nums.length/3)){
                result.add(e.getKey());
            }
        }
        return result;
    }
}