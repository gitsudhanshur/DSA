package Recursion.Strings;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        System.out.println(subseqAsciiret("", "abc"));
//        subseqAscii("", "abc");
    }

    static void subseq(String  p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqret(String  p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqret(p + ch, up.substring(1));
        ArrayList<String> right = subseqret(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    /*
    char ch = 'a';
    print (ch + 0);
     */

    static void subseqAscii(String  p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subseqAsciiret(String  p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subseqAsciiret(p + ch, up.substring(1));
        ArrayList<String> second = subseqAsciiret(p, up.substring(1));
        ArrayList<String> third = subseqAsciiret(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
