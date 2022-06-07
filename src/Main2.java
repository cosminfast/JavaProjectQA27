import java.util.Scanner;

public class Main2 {

    static String classVariable = "Fresh!";
    public static void main(String[] args) {
        String localVariable = "Uau";
        System.out.println(localVariable);
        System.out.println(classVariable);

        Calculator calc = new Calculator();
        System.out.println(calc.sum(3,4));
        System.out.println(calc.substract(1,10.5));

        Print print = new Print();
        print.printStars();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Suma numerelor tale este: " + calc.sum(firstNumber, secondNumber));

    }



}
