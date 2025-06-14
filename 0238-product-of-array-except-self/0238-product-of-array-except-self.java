class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        // Step 1: Store prefix products
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * suffix;
            suffix = suffix * nums[i];
        }

        return output;
    }
}
