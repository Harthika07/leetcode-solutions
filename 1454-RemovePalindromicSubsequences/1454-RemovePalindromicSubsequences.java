// Last updated: 12/08/2026, 11:24:54
class Solution {
    public int removePalindromeSub(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
          if(s.charAt(left) != s.charAt(right)){
                return 2;
            }
            left++;
            right--;
        }
        return 1;
    }
}