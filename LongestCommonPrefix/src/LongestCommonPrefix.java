/**
 * LongestCommonPrefix.java
 *
 * Finds the longest prefix shared by all strings in array.
 */
class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0]; // Can be any string, but first string is guaranteed to exist

        for (int i=1; i<strs.length; i++) {
            // Shrinks prefix until it fits to current string prefix
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }

        return prefix;
    }
}