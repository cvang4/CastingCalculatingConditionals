import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a number:");
        int numOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int numTwo = Integer.valueOf(scanner.nextLine());

        float a = (float)numOne;
        float b = (float)numTwo;

        int addition = numOne + numTwo;
        int subtraction = numOne - numTwo;
        int multiplication = numOne * numTwo;
        float division = a / b;
        int moduls = numOne % numTwo;

        System.out.println(numOne + " + " + numTwo + " = " + addition);
        System.out.println(numOne + " - " + numTwo + " = " + subtraction);
        System.out.println(numOne + " * " + numTwo + " = " + multiplication);
        System.out.println(numOne + " / " + numTwo + " = " + division);
        System.out.println(numOne + " % " + numTwo + " = " + moduls);
        scanner.close();
    }
}
