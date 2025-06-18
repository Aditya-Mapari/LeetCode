class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int product = 1;

        // Left to Right pass
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            maxProduct = Math.max(maxProduct, product);

            if (product == 0) {
                product = 1; // reset product when 0 encountered
            }
        }

        product = 1;

        // Right to Left pass
        for (int i = nums.length - 1; i >= 0; i--) {
            product *= nums[i];
            maxProduct = Math.max(maxProduct, product);

            if (product == 0) {
                product = 1;
            }
        }

        return maxProduct;
    }
}
