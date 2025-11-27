class Solution {
    public int findMin(int[] nums) {
        int start = 0 , end = nums.length-1;
         // If array is not rotated
        if (nums[start] <= nums[end]) {
            return nums[start];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot point
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }

            // Decide which half to search
            if (nums[mid] >= nums[start]) {
                // Left half is sorted, so min must be in right half
                start = mid + 1;
            } else {
                // Right half is sorted, so min must be in left half
                end = mid - 1;
            }
        }
        return -1; // should never reach here

    }
}