class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int index = m; // start inserting at position m

        for (int i = 0; i < n; i++) {
            nums1[index++] = nums2[i]; // copy nums2 elements into nums1
        }

        Arrays.sort(nums1); 

       
    }
}