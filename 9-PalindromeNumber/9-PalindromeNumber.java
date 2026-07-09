// Last updated: 7/9/2026, 12:45:01 PM
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int original = x;
        long reversed = 0;

        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return original == reversed;
    }
}