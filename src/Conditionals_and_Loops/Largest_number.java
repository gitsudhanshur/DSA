package Conditionals_and_Loops;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: Find the largest of the 3 numbers
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//
//        System.out.println(max);

        // 2nd Method
//        int max = 0;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//
//        System.out.println(max);

        // 3rd Method
        int max = Math.max(c, Math.max(a, b));

        System.out.println(max);
    }
}
