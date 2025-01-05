package Functions_Methods;

import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isArmstrong(n));

        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        if (sum == original) {
            return true;
        }
        return false;
    }
}
