package OOPS;

public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sudhanshu";
        s1.percent = 92.4;
//        System.out.println(s1.getRno());
        s1.setRno(44);
        System.out.println(s1.getRno());
    }
}
