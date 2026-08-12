// Last updated: 12/08/2026, 11:23:41
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String op:operations){
            if(op.contains("+")){
                x++;
            }
            else{
                x--;
            }
        }
        return x;
        
    }
}