import java.util.Scanner;

public class DecimalToOctalConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any decimal number"); //octal num:- base is 8
        int num = sc.nextInt();
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
