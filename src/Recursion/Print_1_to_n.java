package Recursion;

public class Print_1_to_n {
    public static void main(String[] args) {
        funRev(5);
    }

    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }

//    static void funBoth(int n) {
//        if (n == 0) {
//            return;
//        }
//        System.out.println(n);
//        funBoth(n-1);
//        System.out.println(n);
//    }
}
