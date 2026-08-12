// Last updated: 12/08/2026, 11:25:28
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                a[index]=nums[i];
                index++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                a[index]=nums[i];
                index++;
            }
        }
        return a;
        
    }
}