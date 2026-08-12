// Last updated: 12/08/2026, 11:24:31
import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {

        int[] freq = new int[201];      // index = num + 100
        for (int x : nums) freq[x + 100]++;

        Integer[] a = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(a, (x, y) -> {
            int fx = freq[x + 100], fy = freq[y + 100];
            return fx == fy ? y - x : fx - fy;
        });

        for (int i = 0; i < nums.length; i++) nums[i] = a[i];
        return nums;
    }
}
