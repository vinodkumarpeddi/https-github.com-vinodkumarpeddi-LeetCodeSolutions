import java.util.HashMap;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
            // If s1 is longer than s2, s1 cannot be a substring of s2
                    if (s1.length() > s2.length()) {
                                return false;
                                        }

                                                // HashMap to store the frequency of characters in s1
                                                        HashMap < Character, Integer > map = new HashMap <> ();
                                                                for (char ch : s1.toCharArray()) {
                                                                            map.put(ch, map.getOrDefault(ch, 0) + 1);
                                                                                    }

                                                                                            // Initialize a HashMap to store the frequency of characters in the current window of s2
                                                                                                    HashMap < Character, Integer > windowMap = new HashMap <> ();
                                                                                                            int windowSize = s1.length();

                                                                                                                    // First, fill the window with the first 'windowSize' characters of s2
                                                                                                                            for (int i = 0; i < windowSize; i++) {
                                                                                                                                        char ch = s2.charAt(i);
                                                                                                                                                    windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);
                                                                                                                                                            }

                                                                                                                                                                    // Check if the first window matches the character frequencies in s1
                                                                                                                                                                            if (windowMap.equals(map)) {
                                                                                                                                                                                        return true;
                                                                                                                                                                                                }

                                                                                                                                                                                                        // Slide the window across s2
                                                                                                                                                                                                                for (int i = windowSize; i < s2.length(); i++) {
                                                                                                                                                                                                                            char newChar = s2.charAt(i); // New character to add to the window
                                                                                                                                                                                                                                        char oldChar = s2.charAt(i - windowSize); // Character to remove from the window

                                                                                                                                                                                                                                                    // Add new character to the window
                                                                                                                                                                                                                                                                windowMap.put(newChar, windowMap.getOrDefault(newChar, 0) + 1);

                                                                                                                                                                                                                                                                            // Remove the old character from the window
                                                                                                                                                                                                                                                                                        if (windowMap.get(oldChar) == 1) {
                                                                                                                                                                                                                                                                                                        windowMap.remove(oldChar); // Remove the entry if the count goes to 0
                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                    windowMap.put(oldChar, windowMap.get(oldChar) - 1);
                                                                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                                                                            // Check if the current window matches the character frequencies in s1
                                                                                                                                                                                                                                                                                                                                                                        if (windowMap.equals(map)) {
                                                                                                                                                                                                                                                                                                                                                                                        return true;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                                                                                                    return false; // No permutation of s1 was found in s2
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        