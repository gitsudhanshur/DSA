package Recursion;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = product(55);
        System.out.println(ans);
    }

    static int product(int n) {
        if (n%10 == n) {
            return n;
        }
        return (n%10) * product(n/10);
    }
}
