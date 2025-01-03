package Switch_Statement;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Sudhanshu");
                break;
            case 2:
                System.out.println("Krish");
                break;
            case 3:
                switch (department) {
                    case "CSE":
                        System.out.println("CSE Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department");
                }
                break;
            default:
                System.out.println("Enter correct empID");
        }
    }
}
