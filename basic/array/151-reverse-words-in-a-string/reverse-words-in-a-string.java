class Solution {
    public String reverseWords(String s) {
        // Trim.. 
        // split in words[].. 
        // string buidler append reverse traverse words[]
        String[] words = s.trim().split(" ");
        System.out.println("len " + words.length);
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1 ; i >= 0 ; i--) {
            if(words[i].trim().length() != 0) {
                sb.append(words[i]);
                if(i != 0)
                    sb.append(" ");
            }
        }
        return sb.toString();
    }
}