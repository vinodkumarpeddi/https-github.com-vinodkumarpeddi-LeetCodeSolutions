class Solution {
    public int minSwaps(String s) {
        Stack<Character> st =new Stack<>();
       int imbalance=0;
       int swap=0;
      for(char ch:s.toCharArray())
        {
            if(ch=='[')
            {
                st.push(ch);

            }
            else
            {
                if(st.isEmpty() || st.peek()!='[')
                {
                    imbalance++;
                }
                else
                {
                    st.pop();
                }
            }
        }
        return (imbalance+1)/2;
    }
}