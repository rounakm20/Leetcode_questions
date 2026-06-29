import java.util.Stack;

class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<int[]> st = new Stack<>();

        for (char c : s.toCharArray()) {

            if (!st.isEmpty() && st.peek()[0] == c) {
                
                st.peek()[1]++;

                
                if (st.peek()[1] == k) {
                    st.pop();
                }

            } else {
               
                st.push(new int[]{c, 1});
            }
        }

        
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            int[] pair = st.pop();

            char ch = (char) pair[0];
            int freq = pair[1];

            while (freq-- > 0) {
                sb.append(ch);
            }
        }

        
        return sb.reverse().toString();
    }
}
