package Conditionals_and_Loops;

import java.util.Scanner;

public class Fibonacci_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

//        System.out.print(a + " " + b);

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;

//            System.out.print(" " + b);
        }
        System.out.println(b);

//        int f0 = 0;
//        int f1 = 1;
//        int count = 2;
//
//        System.out.print(f0 + " " + f1);
//        while(count <= n){
//            int f2 = f0 + f1;
//            f0 = f1;
//            f1 = f2;
//            count++;
//
//            System.out.print(" " + f2);
//        }


//        int a = 0;
//        int b = 1;
//        System.out.print(a + " " + b);
//
//        for (int i = 2; i <= n ; i++) {
//            int c = a + b;
//            a = b;
//            b = c;
//
//            System.out.print(" " + c);
//        }
    }
}
