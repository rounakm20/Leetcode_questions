class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (st.isEmpty()) {
                st.push(ch);
                continue;
            }

            if (st.peek() == ch) {
                st.pop();
                continue;
            }

            st.push(ch);
        }

        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {
            res.append(st.peek());
            st.pop();
        }

        return res.reverse().toString();
    }
}
