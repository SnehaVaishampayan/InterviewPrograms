class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) {
            return false;
        }
        Map<String, Character> hm = new HashMap<>();
        // int chCount = 0;
        // System.out.println((char) (chCount + 'a'));
        int patternItr = 0;
        for(String eachWord:  words){
            if(patternItr >= pattern.length()) {
                return false;
            }
            if(!hm.containsKey(eachWord)) {
                if(hm.values().contains(pattern.charAt(patternItr)) ) {
                    return false;
                }
                hm.put(eachWord, pattern.charAt(patternItr));                
            }
            else {
                // check if char matches
                if(pattern.charAt(patternItr) != hm.get(eachWord)){
                    return false;
                }
            }
            patternItr++;
        }
        return true;
    }
}