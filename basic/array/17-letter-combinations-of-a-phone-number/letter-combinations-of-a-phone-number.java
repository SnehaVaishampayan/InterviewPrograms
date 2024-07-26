class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return result;
        }
        Map<Character, String> hm = new HashMap<>();
        // Populate map with phone dialpad
        hm.put('0', ""); hm.put('1', ""); hm.put('2', "abc"); hm.put('3', "def"); hm.put('4', "ghi");
        hm.put('5', "jkl"); hm.put('6', "mno"); hm.put('7', "pqrs"); hm.put('8', "tuv"); hm.put('9', "wxyz");
        
        combinationRecursion(new StringBuilder(), 0, digits, hm, result);
        return result;
    }
    private void combinationRecursion(StringBuilder currSb, int currDigitsPtr, String digits, Map<Character, String> hm, List<String> result) {

        if(currDigitsPtr >= digits.length()) {
            result.add(currSb.toString());
            return;
        }
        char currDigitChar = digits.charAt(currDigitsPtr);
        String s = hm.get(currDigitChar);
        for(char ch: s.toCharArray()) {
            currSb.append(ch);
            combinationRecursion(currSb, currDigitsPtr + 1,  digits, hm, result);
            currSb.deleteCharAt(currSb.length()-1);
        }
    }
}