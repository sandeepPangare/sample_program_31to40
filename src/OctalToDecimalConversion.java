import java.util.Scanner;

public class OctalToDecimalConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Octal Number"); // It's base as eight
        int num = sc.nextInt();

        int decimal = 0;
        int temp = num;
        int i = 0;

        while (temp > 0) {
            int rem = temp % 10;
            temp = temp / 10;
            decimal = decimal + rem * (int) Math.pow(8, i++);
        }
        System.out.println("Decimal of " + num + " is " + decimal);
    }
}
