package Functions_Methods;

public class String_Example {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        String personalised = myGreet("Sudhanshu");
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "How are you";
        return greeting;
    }
}
