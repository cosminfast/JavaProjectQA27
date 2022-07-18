import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

    public int getInt() {
        int number = 0;
        boolean repeat;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.println("Please enter a number: ");
                number = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException exception) {
                System.err.println("Please enter a valid number! Given value: " + scan.next());
                repeat = true;
            }
        } while (repeat);
        return number;
    }

    public double getDouble() {
        double number = 0;
        boolean repeat;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.println("Please enter a number: ");
                number = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException exception) {
                System.err.println("Please enter a valid number! Given value: " + scan.next());
                repeat = true;
            }
        } while (repeat);
        return number;
    }

}
