class Solution {
    public boolean validPalindrome(String s) {
        // start from both ends.. 'if char at leftPtr != rightPtr' .. 
        //                              mve left.. left+1 check isPalindrome(left+1, right
        //                              mve right .. right - 1 .. check isPalindrome(left, right-1)

        int left = 0; int right = s.length()-1;
        boolean diffFound = false;
        boolean result = false;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                diffFound = true;
                if(s.charAt(left+1) == s.charAt(right)) {
                    result = isPalindrome(s, left+1, right);
                }
                if(!result ) {
                    result = isPalindrome(s, left, right - 1);
                }
                return result;
            }
            left++;
            right--;
        }
        if(!diffFound) {
            return (right-left) <= 1;
        }
        return false;
    }

    private boolean isPalindrome(String s, int left, int right) {

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return (right-left) <= 1;
    }
}