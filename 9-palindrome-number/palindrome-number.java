class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int n = x;
        int y = 0;
        while (n != 0) {
            int r = n%10;
            y = y*10 + r;
            n = n/10;

        }
        return x == y;
    }
}