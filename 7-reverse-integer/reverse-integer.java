class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int d = x % 10;
            x /= 10;

            // overflow check
            if (rev > 214748364 || rev < -214748364)
                return 0;

            rev = rev * 10 + d;
        }
        return rev;
    }
}
