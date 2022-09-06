import java.util.Scanner;

public class DecimalToBinaryConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int num = sc.nextInt();
        String binary = "";
        int temp = num;

        while (temp > 0)
        {
            int r = temp % 2;
            temp = temp / 2;
            binary = r + binary;
        }
        System.out.println("Binary Equivalent of " + num + " is " + binary);

    }
}
