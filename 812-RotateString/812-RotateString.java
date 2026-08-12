// Last updated: 12/08/2026, 11:25:31
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        for(int i=0;i<s.length();i++) {
            if((s+s).indexOf(goal)!=-1) return true;
        }
        return false;
    }
}