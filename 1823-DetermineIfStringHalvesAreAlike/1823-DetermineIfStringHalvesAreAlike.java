// Last updated: 12/08/2026, 11:24:20
class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int firstHalf = 0;
        int secondHalf = 0;
        for (int i = 0; i < mid; i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                firstHalf++;
            }
        }

        for (int i = mid; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (isVowel(ch)) {
                secondHalf++;
            }
        }

        return firstHalf == secondHalf;
    }

    public boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}