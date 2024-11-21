class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0; int right = s.length()-1;
        char[] ch = s.toCharArray();
        while(left < right) {
            System.out.println(s.charAt(left));
            System.out.println(s.charAt(right));
            while(left < right && left < s.length() && !Character.isLetter(ch[left])) {
                System.out.println("in w1 "+s.charAt(left));
                left++;
            }
            while(left < right && right >= 0 && !Character.isLetter(ch[right])) {
                System.out.println("in w2 "+s.charAt(right));
                right--;
            }
            if(left < s.length() && right >= 0 && left < right) {
                System.out.println("if " + s.charAt(left));
                System.out.println("if " + s.charAt(right));
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