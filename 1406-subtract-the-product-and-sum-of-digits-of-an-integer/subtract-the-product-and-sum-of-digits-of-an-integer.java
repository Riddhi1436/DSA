class Solution {
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n = n / 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        int n1 = 55;
        int n2 = 1457;

        System.out.println(subtractProductAndSum(n1));
        System.out.println(subtractProductAndSum(n2));
    }
}
