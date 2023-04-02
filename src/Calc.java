import java.util.Scanner;

public class Calc {

    static void calc() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int namb_1 = scan.nextInt();

        System.out.println("Enter second number:");
        int namb_2 = scan.nextInt();

        System.out.println("Enter arithmetic operation:");
        String op = scan.next();

        switch (op) {
            case ("+"):
                System.out.println(namb_1 + namb_2);
                break;
            case ("-"):
                System.out.println(namb_1 - namb_2);
                break;
            case ("*"):
                System.out.println(namb_1 * namb_2);
                break;
            case ("/"):
                if(namb_2 == 0) System.out.println("Error");
                else {
                    System.out.println((float) (namb_1 / namb_2));
                }
        }
    }
}
