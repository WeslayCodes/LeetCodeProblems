import java.util.Map;
import java.util.HashMap;

/**
 * TwoSum.java
 *
 * Finds the indexes of the two values in an array that sum to a target value.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Stores complementary number and index of numbers looped over
        Map<Integer, Integer> complements = new HashMap<>();

        // Loops through each number, adding the number's complement to HashMap.
        // If the number's complement is in the HashMap, return the current index and index of complement.
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];

            if (complements.containsKey(complement)) {
                return new int[] {complements.get(complement), i};
            }

            complements.put(nums[i], i);
        }

        return new int[] {};
    }
}
