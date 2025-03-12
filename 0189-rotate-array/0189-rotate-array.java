class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n
        int[] temp = new int[n - k];

        // Store first (n-k) elements in temp
        for (int i = 0; i < n - k; i++) {
            temp[i] = nums[i];
        }

        // Shift the remaining k elements to the front
        for (int i = n - k; i < n; i++) {
            nums[i - (n - k)] = nums[i];
        }

        // Copy temp back to nums
        for (int i = k; i < n; i++) {
            nums[i] = temp[i - k];
        }
    }
}
