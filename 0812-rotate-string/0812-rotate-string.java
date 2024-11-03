class Solution {
    public boolean rotateString(String s, String goal) {
        // Check if lengths of s and goal are equal; otherwise, they can't be rotations
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Concatenate s with itself; if goal is a rotation, it will appear as a substring
        String doubled = s + s;
        return doubled.contains(goal);
    }
}
