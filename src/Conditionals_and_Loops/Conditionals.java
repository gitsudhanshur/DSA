package Conditionals_and_Loops;

public class Conditionals {

    public static void main(String[] args) {

//        int salary = 25400;
//        if (salary > 10000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }
//
//        System.out.println(salary);

        // multiple if-else

        int salary = 25400;
        if (salary > 30000) {
            salary += 2000; // salary = salary + 2000
        } else if (salary > 35000) {
            salary += 3000;
        } else {
            salary += 1000;
        }

        System.out.println(salary);
    }
}
