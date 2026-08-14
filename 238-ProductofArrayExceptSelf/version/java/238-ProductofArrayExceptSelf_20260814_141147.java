// Last updated: 14/08/2026, 14:11:47
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] answer = new int[n];
5        int left = 1;
6        for (int i = 0; i < n; i++) {
7            answer[i] = left;
8            left *= nums[i];
9        }
10        int right = 1;
11        for (int i = n - 1; i >= 0; i--) {
12            answer[i] *= right;
13            right*=nums[i];
14        }
15        return answer;
16    }
17}