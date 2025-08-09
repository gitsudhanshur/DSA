package Recursion.Strings;

public class skipCharacter {
    public static void main(String[] args) {
        System.out.println(skip2("baccdah"));
    }

    static void skip1(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip1(p, up.substring(1));
        } else {
            skip1(p + ch, up.substring(1));
        }
    }

    static String skip2(String up){
        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip2(up.substring(1));
        } else {
            return ch + skip2(up.substring(1));
        }
    }
}
