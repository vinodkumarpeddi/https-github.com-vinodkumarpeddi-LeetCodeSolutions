import java.math.BigInteger;

class Solution {
    public int letterToValue(char c) {
        return c - 'a' + 1;
    }

    public int digits(BigInteger num) {
        int sum = 0;
        String numStr = num.toString();
        for (char c : numStr.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }

    public int getLucky(String s, int k) {
        StringBuilder largeNumber = new StringBuilder();
        for (char c : s.toCharArray()) {
            largeNumber.append(letterToValue(c));
        }

        // Parse the large number as a BigInteger
        BigInteger transformedValue = new BigInteger(largeNumber.toString());
        for (int i = 0; i < k; i++) {
            transformedValue = BigInteger.valueOf(digits(transformedValue));
        }

        return transformedValue.intValue();
    }
}
