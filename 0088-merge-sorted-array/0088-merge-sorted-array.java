class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int[] arr = new int[m + n]; // Extra array
        int i = 0, j = 0, k = 0;

        // Merge nums1 and nums2
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < m) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            arr[k] = nums2[j];
            j++;
            k++;
        }

        // Copy back to nums1
        for (k = 0; k < m + n; k++) {
            nums1[k] = arr[k];
        }

       
    }
}