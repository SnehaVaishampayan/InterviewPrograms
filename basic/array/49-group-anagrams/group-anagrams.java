class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap sortedStrs 
        // Traverse strs 
        //      
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> hm = new HashMap<>();
        for(String s: strs) {
            // Checks 
            if(s == null) {
                continue;
            }
            // Sort char array of input s
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            List<String> al;
            if(hm.containsKey(sortedStr)) {
                al = hm.get(sortedStr);
                al.add(s);                
            }   
            else {
                al = new ArrayList<>();
                al.add(s);
            }
            hm.put(sortedStr, al);
        }

        for(Map.Entry<String, List<String>> e: hm.entrySet()) {
            result.add(e.getValue());
        }
        return result; 



























        // // sort str 
        // // map .. sorted string and word
        
        // Map<String, List<String>> hm = new HashMap<>();
        // List<List<String>> result = new ArrayList<>();
        // for(String s: strs) {
        //     char[] ch = s.toCharArray();
        //     Arrays.sort(ch);
        //     String sortedStr = new String(ch);
        //     List<String> values;
        //     if(hm.containsKey(sortedStr)) {
        //          values = hm.get(sortedStr);      
        //     }
        //     else {
        //          values = new ArrayList<>();
        //     }
        //     values.add(s);
        //     hm.put(sortedStr, values);            
        // }
        // for(Map.Entry<String, List<String>> e: hm.entrySet()) {
        //     result.add(e.getValue());
        //     System.out.println(e.getValue());
        // }
        // return result;
    }
}