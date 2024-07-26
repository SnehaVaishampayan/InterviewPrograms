class Solution {
    public boolean isIsomorphic(String s, String t) {
        //  Map the chars.. 
        // Length same?? 
        //  Traverse s and t
        //      for sch
        //          if sch in hm .. if hm.get(sch) != tch.. return false
        //          else if .. tch is in values.. (hm.containsValue(tch)
                            // return false
                        // else .. add to hm sch-tch
        //  return true
        if(s== null && t == null)
            return true;
        if(s.length() == 0 && t.length() == 0)
            return true;
        if(s == null || t == null) 
            return false;
        if(s.length() != t.length()) 
            return false;

        Map<Character, Character> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char sch = s.charAt(i); 
            char tch = t.charAt(i);

            if(hm.containsKey(sch)) {
                if(tch != hm.get(sch)) 
                    return false;                
            }
            else {
                if(hm.containsValue(tch))  { // ******* containsVALUE
                    return false;
                }
                else {
                    hm.put(sch,tch);
                }
            }
        }
        return true;

    }
}