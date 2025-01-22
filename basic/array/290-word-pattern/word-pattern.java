class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Separate words in words[]
        // if words.length != pattern.length
        //      no match

        // maintain TWO hashmaps - <Character, String> / <String, Char> 
        //          patternChar <-> word
        //          word        <-> patternChar

        // case 1 .. patternChar in hm1 ..  if hm.get matches word              .. continue
        // case 2 .. patternChar in hm1 ..  if hm.get Not matches word          ..  false
        // case 3 .. word in hm2         .. if hm.get matches patternChar       ..  continue 
        // case 4 .. word in hm2         .. if hm.get NOT matches patternChar   ..  false 

        String[] words = s.trim().split(" ");
        if(words.length != pattern.length()) {
            return false;
        }
        Map<Character, String> hm1 = new HashMap<>();
        Map<String, Character> hm2 = new HashMap<>();

        for(int i = 0; i < words.length; i++ ) {
            String eachWord = words[i]; 
            char patternChar = pattern.charAt(i);
            System.out.println("eachWord " + eachWord);
            System.out.println("patternChar " + patternChar);

            // Case 1
            if(hm1.containsKey(patternChar)) {
                if(!hm1.get(patternChar).equals(eachWord)) {
                    return false;
                }
                else{
                    continue;
                }
            }
            // Case 3
            else if(hm2.containsKey(eachWord)) {
                if(hm2.get(eachWord) != patternChar) {
                    return false;
                }
                else {
                    continue;
                }
            }
            else {
                // Add in both maps
                hm1.put(patternChar, eachWord);
                hm2.put(eachWord, patternChar);   
            }
        }
        return true;
    }
}