class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] pse = new int[n], nse = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && heights[i] <= heights[st.peek()]) st.pop();

            if(st.isEmpty()) pse[i] = 0;

            else pse[i] = st.peek() + 1;

            st.push(i);
        }

        st.clear();

        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && heights[i] <= heights[st.peek()]) st.pop();

            if(st.isEmpty()) nse[i] = n - 1;

            else nse[i] = st.peek() - 1;

            st.push(i);
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, ((nse[i] - pse[i] + 1) * heights[i]));
        }

        return max;
    }
}
