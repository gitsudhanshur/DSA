package Conditionals_and_Loops;

import java.util.Scanner;

public class Alphabet_case_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String word = "Hello";
//        System.out.println(word.charAt(0));

        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
