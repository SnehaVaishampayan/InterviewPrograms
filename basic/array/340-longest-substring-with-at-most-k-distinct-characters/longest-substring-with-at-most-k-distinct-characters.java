class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // int start = 0; 
        // int end = 0;
        // HashMap.. char - lastOccurenceIndex
        // Traverse string..
        //     Add/update char to hashMap.. char - lastOccurenceIndex
        //     if hm.size() > k .. 
        //         startChar lastOccurence.. 
        //         end = start 
        //         clear hashMap

        // Walkthru 
        // e = 2 ; c = 1 
        // size <= k
        // e= 2 ; c = 1; b = 3
        // now size > k 
        //  startChar = e 
        //  startCharLastOccurence= 2
        // start = startCharLastOccurence + 1 = 3 

        // if(s == null || s.length() == 0 ){
        //     return 0;
        // } 
        // if(k >= s.length()) {
        //     return s.length();
        // }
        // Map<Character, Integer> hm = new HashMap<>();
        // int start = 0;
        // int result = k;
        // for(int end = 0; end < s.length(); end++) {
        //     char currChar = s.charAt(end);
        //     hm.put(currChar, end);
        //     if( hm.size() > k) {
        //         char startChar = s.charAt(start);
        //         System.out.println("start " + start);
        //         System.out.println("end " + end);

        //         result = Math.max(result, end-start+1);
        //         System.out.println("result " + result);
        //         start++;// = hm.get(startChar) + 1;
        //      }
        // }
        // if(hm.size() <= k)
        //     return s.length();
        // // result = Math.max(result, s.length()-start+1);
        // return result;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        if(k==0 || s==null || s.length()==0)
            return 0;
        if(s.length()<k)
            return s.length();
        int maxLen=k;
        int left = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
            if(map.size()>k){
                maxLen=Math.max(maxLen, i-left);
                while(map.size()>k) {
                    char fc = s.charAt(left);
                    if(map.get(fc)==1){
                        map.remove(fc);
                    }
                    else {
                    map.put(fc, map.get(fc)-1);
                    }
                left++;
                }        
            }
        }
        return Math.max(maxLen, s.length()-left);
    }
}
