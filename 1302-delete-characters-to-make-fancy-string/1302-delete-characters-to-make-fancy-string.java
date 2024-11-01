class Solution {
    public String makeFancyString(String s) {
        StringBuilder st = new StringBuilder();
        int count = 1; // Initialize the count for consecutive characters
        
        // Add the first character to start the comparison
        st.append(s.charAt(0));
        
        // Start from the second character
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++; // Increment count if the current character is the same as the previous one
            } else {
                count = 1; // Reset count if the current character is different
            }
            
            // Append character only if count is less than 3
            if (count < 3) {
                st.append(s.charAt(i));
            }
        }
        
        return st.toString();
    }
}
