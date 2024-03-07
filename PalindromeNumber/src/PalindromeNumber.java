/**
 * PalindromeNumber.java
 *
 * Returns whether a number is a palindrome.
 */
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Negatives not palindromes.
        // Non-zero numbers ending with 0 cannot be palindromes. (No leading zeros)
        if (x < 0 || x != 0 && x % 10 == 0) {
            return false;
        }

        int reverse = 0;

        // Loops until halfway point, gathering reverse of first half
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        // Reversed first half is equal to second half or there's a value between equal halves
        return x == reverse || x == reverse / 10;
    }
}