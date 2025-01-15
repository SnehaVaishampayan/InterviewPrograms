class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Work backwards
        int resultItr = m + n-1;
        int n2ItrFromLast = n-1;
        int n1ItrFromLast = m-1;

        while(n1ItrFromLast >= 0 && n2ItrFromLast >= 0) {
            // see which one is big elelment
            if(nums1[n1ItrFromLast] > nums2[n2ItrFromLast] ) {
                nums1[resultItr] = nums1[n1ItrFromLast];
                n1ItrFromLast--;
            }
            else{
                nums1[resultItr] = nums2[n2ItrFromLast];
                n2ItrFromLast--;
            }
            resultItr--;
        }
        while(n2ItrFromLast >= 0 ) {
            nums1[resultItr] = nums2[n2ItrFromLast];
            n2ItrFromLast--;
            resultItr--;
        }
    }
}