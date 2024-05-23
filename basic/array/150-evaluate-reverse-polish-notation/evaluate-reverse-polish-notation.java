class Solution {
    public int evalRPN(String[] tokens) {
        // get the stack
        // if number put in stack
        // else operated with polling top two

        Stack<Integer> st = new Stack<>();
        int result = 0;
        String operations = "+-*/";
        for(int i = 0; i < tokens.length; i++) {
            if(operations.indexOf(tokens[i])== -1) { // it is number
                st.push(Integer.valueOf(tokens[i]));
            }
            else {
                int val1 = st.pop();
                int val2 = st.pop();
                if(tokens[i].equals("+")) {
                    st.push(val1+val2);
                }                
                if(tokens[i].equals("-")) {
                    st.push(val2-val1);
                }                
                if(tokens[i].equals("*")) {
                    st.push(val1*val2);
                }                
                if(tokens[i].equals("/")) {
                    st.push(val2/val1);
                }
                System.out.println();
            }
        }
        return st.pop();        
    }
}