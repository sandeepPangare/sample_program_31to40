import java.util.Scanner;

public class BinaryToDecimalConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int num = scanner.nextInt();

        int decimal = 0;
        int temp = num;
        int i = 0;

        while (temp > 0) {
            int rem = temp % 10;
            temp = temp / 10;
            decimal= decimal + rem * (int) Math.pow(2, i++);
        }
        System.out.println("Decimal of " + num + " is " + decimal);
    }
}
