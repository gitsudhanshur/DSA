package String;

public class Comparison {
    public static void main(String[] args) {
        String a = "Sudhanshu";
        String b = "Sudhanshu";
        String c = a;
        System.out.println(c == a);

        // ==
        System.out.println(a == b);

        String name1 = new String("Sudhanshu");
        String name2 = new String("Sudhanshu");

//        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}
