package Functions_Methods;

public class Function_Overloading {
    public static void main(String[] args) {
//        fun(50);
//        fun("Sudhanshu");
        int ans = sum(5, 5);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
