// 9:10 -> 9:20
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {        
        Set<Integer> hs = new HashSet<>();
        Set<Integer> hs1 = new HashSet<>();
        for(int i: nums1) {
            hs.add(i);
        }
        for(int i: nums2) {
            if(hs.contains(i)){
                hs1.add(i);
            }
        }
        int[] result = hs1.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}