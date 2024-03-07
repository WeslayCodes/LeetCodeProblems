/**
 * AddBinary.java
 *
 * Adds two binary numbers together and returns
 * binary result.
 */
class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder(); // More efficient than using String variable
        int carry = 0;
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;

        while (aIndex >= 0 || bIndex >= 0) {
            int curSum = carry;

            // Add a value to sum by getting char and subtracting value of 0 char.
            // aIndex decremented for next loop.
            if (aIndex >= 0) {
                curSum += a.charAt(aIndex--) - '0';
            }

            // Add b value to sum by getting char and subtracting value of 0 char
            // bIndex decremented for next loop.
            if (bIndex >= 0) {
                curSum += b.charAt(bIndex--) - '0';
            }

            result.append(curSum % 2);
            carry = curSum / 2;
        }

        // Add carry if leftover after loop
        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}