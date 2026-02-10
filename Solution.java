public class Solution {

    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int d = x % 10;
            x /= 10;

            if (rev > 214748364 || rev < -214748364)
                return 0;

            rev = rev * 10 + d;
        }
        return rev;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        System.out.println(obj.reverse(123));
        System.out.println(obj.reverse(-123));
        System.out.println(obj.reverse(120));
    }
}
