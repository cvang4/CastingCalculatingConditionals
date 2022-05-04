import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Name a number between 0 and 100");
        int number = Integer.valueOf(scanner.next());

        if (number >= 90) {
            System.out.println("Your grade is an A :)");
        } else if (number >= 80 && number < 90) {
            System.out.println("Your grade is a B. Not good enough.");
        } else if (number >= 70 && number < 80) {
            System.out.println("Your grade is a C :/");
        } else if (number >= 60 && number < 70) {
            System.out.println("Your grade is a D. C'mon bro study harder.");
        } else if (number < 60) {
            System.out.println("Your grade is a F :(");
        }
        scanner.close();
    }
}
