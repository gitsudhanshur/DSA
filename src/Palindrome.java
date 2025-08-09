public class Palindrome {
    public static void main(String[] args) {
        int n = 12321;
        int a;
        a = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        System.out.println(sum);
        if (a == sum){
            System.out.println(a + " is a Palindrome number");
        } else {
            System.out.println(a + " is not a Palindrome number");
        }
    }
}
