public class Casting {

    public static void main(String[] args) {
        //Cast double into an int
        double data = 112.35;
        System.out.println("Double: " + data);
        int num = (int)data;
        System.out.println("int: " + num);

        //Cast string into int
        String number = "49";
        System.out.println("The string value is: " + number);
        int num2 = Integer.parseInt(number);
        System.out.println("The integer value is: " + num2);

    }
}