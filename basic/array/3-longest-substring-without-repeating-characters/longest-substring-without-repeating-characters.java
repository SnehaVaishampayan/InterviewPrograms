class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s == null) {
            return 0;
        }
        if(s.length() <= 1) {
            return s.length();
        } 

        Map<Character, Integer> hm = new HashMap<>();
        int start = 0,result = 0;
        for(int end = 0; end < s.length(); end++) {
            char currChar = s.charAt(end);
            if( hm.containsKey(currChar)) {              
                result = Math.max(result, hm.size());
                end = hm.get(currChar);
                hm.clear();
             }
             else {
                hm.put(currChar, end);
             }

        }
        return Math.max(result, hm.size());
    }
}