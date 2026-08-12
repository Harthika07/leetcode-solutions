// Last updated: 12/08/2026, 11:25:44
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            
            if(count>max){
                max=count;
            }
            }
            else{
                count=0;
            }

        }
        return max;
        
    }
}