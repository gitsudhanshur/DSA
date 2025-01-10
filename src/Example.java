public class Example {
    public static void main(String[] args) {
        int i = 6;
        fib(i);
        }
        static void fib(int i) {
            int a = 0;
            int b = 1;
            int count = 2;

            while(count <= i) {
                System.out.println(a);
                int temp = b;
                b = b + a;
                a = temp;
                count++;
            }
        }
}
