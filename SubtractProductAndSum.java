// 1281.Subtract the Product and Sum of Digits of an Integer
public class SubtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;   // get last digit
            product *= digit;     // multiply to product
            sum += digit;         // add to sum
            n = n / 10;           // remove last digit
        }

        return product - sum;
    }

    public static void main(String[] args) {
        int n1 = 234;
        int n2 = 4421;

        System.out.println(subtractProductAndSum(n1)); // Output: 15
        System.out.println(subtractProductAndSum(n2)); // Output: 21
    }
}
