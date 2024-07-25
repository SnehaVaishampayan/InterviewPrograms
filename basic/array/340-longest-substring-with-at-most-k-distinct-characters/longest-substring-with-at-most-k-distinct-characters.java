class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        //  startPtr - endPtr
        //  HashMap - Character-Count
        //  Traverse with endPtr      
        //      put eachChar HashMap - Character-Count
        //      if hashMap size > k .. means more than K distinct characters. 
        //          until size <= k .. 
        //          start++
        //          reduce/Shrink start.. 
        //          remove startChars from hashmap .. 
        
        if(s == null || s.length() == 0 ){
            return 0;
        } 
        if(k >= s.length()) {
            return s.length();
        }
        Map<Character, Integer> hm = new HashMap<>();
        int start = 0;
        int result = k;
        for(int end = 0; end < s.length(); end++) {
            char currChar = s.charAt(end);

            hm.put(currChar, hm.getOrDefault(currChar,0) + 1);

            if( hm.size() > k) {
                
                result = Math.max(result, end-start);
                while(hm.size() > k ) {
                    char startChar = s.charAt(start);
                    if(hm.get(startChar) == 1) {
                        hm.remove(startChar);
                    }
                    else {
                        hm.put(startChar, hm.get(startChar) - 1);
                    }
                    start++;
                }                
             }
        }
        return Math.max(result, s.length()-start);
    }
}
