package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int ans = fact(0);
        System.out.println(ans);
    }

    static int fact (int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n-1);
    }
}
