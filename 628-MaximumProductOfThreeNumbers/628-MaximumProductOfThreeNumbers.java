// Last updated: 12/08/2026, 11:25:35
class Solution {
    public int maximumProduct(int[] nums) {
            Arrays.sort(nums);
            int n=nums.length;
            int a=nums[n-1];
            int b=nums[n-2];
            int c=nums[n-3];
            int d=nums[0];
            int e=nums[1];
            int product1=a*b*c;
            int product2=d*e*a;
            if(product1>product2){
                return product1;
            }
            else
            return product2;
        }
        
    }
