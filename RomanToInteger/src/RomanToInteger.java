import java.util.Map;
import java.util.HashMap;

/**
 * RomanToInteger.java
 *
 * Converts a roman numeral string into an integer.
 */
class RomanToInteger {
    public int romanToInt(String s) {
        int lastCharPos = s.length() - 1;
        int sum = 0;

        // Map of roman numerals with associated integer value
        Map<Character, Integer> nums = new HashMap<>();
        nums.put('I', 1);
        nums.put('V', 5);
        nums.put('X', 10);
        nums.put('L', 50);
        nums.put('C', 100);
        nums.put('D', 500);
        nums.put('M', 1000);

        int lastVal = nums.get(s.charAt(lastCharPos));

        // Loop through each character and add/subtract value character is associated with
        for (int i=0; i<lastCharPos; i++) {
            int nextVal = nums.get(s.charAt(i+1));
            int curVal = nums.get(s.charAt(i));

            if (nextVal > curVal) {
                sum -= curVal;
            } else {
                sum += curVal;
            }
        }

        return sum + lastVal;
    }
}
