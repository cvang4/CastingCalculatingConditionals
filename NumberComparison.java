import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int number = Integer.valueOf(scanner.next());
        System.out.println("Enter another number: ");
        int number2 = Integer.valueOf(scanner.next());

        if (number == number2) {
            System.out.println("Numbers are the same.");
        } else if (number > number2) {
            System.out.println("The first number was larger than the second.");
        } else if (number < number2) {
            System.out.println("The second number was larger than the first.");
        }
        scanner.close();
    }
}
