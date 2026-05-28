class Solution {

    public boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") ||
               s.equals("*") || s.equals("/");
    }

    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {

            if (isOperator(s)) {

                int a = st.pop();
                int b = st.pop();

                if (s.equals("+")) {
                    st.push(b + a);
                }
                else if (s.equals("-")) {
                    st.push(b - a);
                }
                else if (s.equals("/")) {
                    st.push(b / a);
                }
                else {
                    st.push(b * a);
                }

            } else {
                st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }
}