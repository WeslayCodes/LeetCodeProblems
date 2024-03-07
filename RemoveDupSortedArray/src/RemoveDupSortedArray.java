/**
 * RemoveDupSortedArray
 *
 * Removes all duplicates from sorted array by placing uniques at front.
 */
class RemoveDupSortedArray {
    public int removeDuplicates(int[] nums) {
        int numUnique = 1;

        for (int i=1; i<nums.length; i++) {
            if (nums[i] != nums[i - 1]){
                nums[numUnique] = nums[i];
                numUnique++;
            }
        }

        return numUnique;
    }
}