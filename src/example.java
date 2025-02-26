import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n +"th fibonacci number is" + fib(n));
    }

    public static int fib(int n){
        if (n <= 0){
            System.out.println("invalid");
            return n;
        }

        if(n == 0 || n==1){
            return n;
        }

        int prev = fib(n-1);
        int pPrev = fib(n-2);
        return prev + pPrev;
    }
}
