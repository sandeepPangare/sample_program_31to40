import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any decimal number: "); // dec123/(8)rem3 ; 15/(8)rem7 ; 1 ;octal 173
        int num = scanner.nextInt();
        String octal = "";
        int temp = num;

        while (temp > 0)
        {
            int rem = temp % 8;
            temp = temp / 8;
            octal = rem + octal;
        }
        System.out.println("Octal Value of " + num + " is " + octal);

    }
}
