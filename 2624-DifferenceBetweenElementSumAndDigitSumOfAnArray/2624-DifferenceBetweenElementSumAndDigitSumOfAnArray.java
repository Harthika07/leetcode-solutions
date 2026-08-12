// Last updated: 12/08/2026, 11:23:20
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(n>0){
            int dig=n %10;
            sum1+=dig;
            n/=10;
            }
        }
        int result=sum-sum1;
        return Math.abs (result);
    }
}