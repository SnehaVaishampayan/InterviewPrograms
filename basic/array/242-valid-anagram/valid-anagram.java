class Solution {
    public boolean isAnagram(String s, String t) {
        // Sort charArray s and t
        // match lengths 
        // Traverse chars.. 
        //      if mismatch.. 
        //          return false. 
        
        if(s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);
        System.out.println(sArr);
        System.out.println(tArr);
        for(int i = 0; i < sArr.length; i++) {
            if(sArr[i] != tArr[i]) {
                return false;
            }
        }
        return true;
    }
}