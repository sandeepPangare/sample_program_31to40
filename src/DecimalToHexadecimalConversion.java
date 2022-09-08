import java.util.Scanner;

public class DecimalToHexadecimalConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any decimal number");
        int num = sc.nextInt();
        String hexa = "";
        int temp = num;

        while (temp > 0)
        {
            int rem = temp % 16;
            temp = temp / 16;
            hexa = rem + hexa;
        }
        System.out.println("Hexadecimal Equivalent of " + num + " is " + hexa);
    }
}
