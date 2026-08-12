// Last updated: 12/08/2026, 11:26:33
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Create a new array to store the result
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge elements from both arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        // Copy remaining elements
        while (i < m) {
            result[k++] = nums1[i++];
        }
        while (j < n) {
            result[k++] = nums2[j++];
        }

        // Copy result back to nums1
        for (int x = 0; x < m + n; x++) {
            nums1[x] = result[x];
        }
    }
}