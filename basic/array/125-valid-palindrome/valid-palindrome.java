class Solution {
    public boolean isPalindrome(String s) {
        boolean result = false;

        // TEMPLATE: TWO POINTERS

        //Edge cases 
        if(s == null || s.length() <= 1) {
            return true;
        }

        int left = 0; int right = s.length()-1;

        while(left < right) {
            while(left < s.length() && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while(right >= 0 && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            
            }
            if(left >= s.length() || right < 0) {
                return true;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)) ) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}