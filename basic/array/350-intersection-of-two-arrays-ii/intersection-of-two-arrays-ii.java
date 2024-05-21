// 9:25 -> 9:35
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        for(int i: nums1) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        for(int i: nums2) {
            if(hm.containsKey(i)) {
                al.add(i);
                hm.put(i, hm.get(i)-1);
                if(hm.get(i) == 0) {
                    hm.remove(i);
                }
            }
        }
        int[] result = al.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}