class Solution {
    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);
        long[] candidates = generateCandidates(n);
        
        long closestPalindrome = -1;
        long minDiff = Long.MAX_VALUE;

        for (long candidate : candidates) {
            if (candidate != num) {
                long diff = Math.abs(candidate - num);
                if (diff < minDiff || (diff == minDiff && candidate < closestPalindrome)) {
                    closestPalindrome = candidate;
                    minDiff = diff;
                }
            }
        }
        
        return String.valueOf(closestPalindrome);
    }

    private long[] generateCandidates(String n) {
        long[] candidates = new long[5];
        int len = n.length();
        String half = n.substring(0, (len + 1) / 2); // the first half of the number
        long halfNum = Long.parseLong(half);
        
        // Generate possible palindromes
        candidates[0] = createPalindrome(halfNum - 1, len); // Smaller half
        candidates[1] = createPalindrome(halfNum, len);     // Same half
        candidates[2] = createPalindrome(halfNum + 1, len); // Larger half

        // Edge cases for boundaries
        candidates[3] = (long) Math.pow(10, len - 1) - 1; // 999...999
        candidates[4] = (long) Math.pow(10, len) + 1;     // 1000...001

        return candidates;
    }

    private long createPalindrome(long half, int len) {
        String halfStr = String.valueOf(half);
        StringBuilder sb = new StringBuilder(halfStr);
        if (len % 2 == 0) {
            sb.append(new StringBuilder(halfStr).reverse());
        } else {
            sb.append(new StringBuilder(halfStr).reverse().substring(1));
        }
        return Long.parseLong(sb.toString());
    }
}
