// Last updated: 12/08/2026, 11:25:21
class Solution {
    public int[] sortedSquares(int[] nums) {
     for( int i=0;i<nums.length;i++){
        nums[i]=nums[i]*nums[i];

     }
     Arrays.sort(nums);
    

        
    
    
    return nums;
    }
}