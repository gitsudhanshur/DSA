package String;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Sudhanshu Ranjan";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println("         Sudhanshu      ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
