class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0; int right = s.length()-1;
        char[] ch = s.toCharArray();
        while(left < right) {
            while(left < right && left < s.length() && !Character.isLetter(ch[left])) {
                left++;
            }
            while(left < right && right >= 0 && !Character.isLetter(ch[right])) {
                right--;
            }
            if(left < s.length() && right >= 0 && left < right) {
                // swap 
                char c = ch[left];
                ch[left] = ch[right];
                ch[right] = c;
            }
            left++;
            right--;
        }
        return new String(ch);
    }
}