import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // Combine both sentences into one and split into words
        String[] words = (s1 + " " + s2).split(" ");
        
        // Count occurrences of each word
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        // Collect words that appear only once
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        
        // Return the result as an array
        return result.toArray(new String[0]);
    }
}
