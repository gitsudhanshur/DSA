package Conditionals_and_Loops;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        // for loops

        // Q: Print numbers from 1 to 5
//        for (int num = 1; num <= 5; num++) {
//            System.out.println(num);
//        }

        // Q: Print numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 1; num <= n; num += 1) {
////            System.out.print(num + " ");
//            System.out.println("Hello World");
//        }

        // while loops

        // Q: Print numbers from 1 to 5

//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num += 1;
//        }

        // do while loop

        // Q: Print numbers from 1 to 5
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
