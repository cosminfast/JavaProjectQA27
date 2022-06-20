import java.util.Scanner;

public class Main3 {


    public static void main(String[] args) {
//        Given two numbers,
//        see which one is the greatest and print it
        int first = 5;
        int second = 4;

        LogicalOperations op = new LogicalOperations();
//        System.out.println("Greater value is: " + op.getGreaterNumber(first, second));


//        Given a text input and a number input,
//        if the text is equal to “FastTrack” AND
//        the number is equal to or lower than 3,
//        print the text and the number.
//        If the text is not “FastTrack” AND the
//        number is equal to or higher than 4,
//        print the number and the text, in this order.

        String textInput = "FastTracka";
        int number = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti text:");
        textInput = scanner.next();
        System.out.println("Introduceti numar:");
        number = scanner.nextInt();


        System.out.println(op.verifyTextAndNumber(textInput, number));
        System.out.println(op.verifyTextAndNumber2(textInput,number));


    }


}
