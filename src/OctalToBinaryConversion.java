import java.util.Scanner;

public class OctalToBinaryConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Octal Number");
        int Octal =sc.nextInt();
        int decimal =0;
        int temp=Octal;
        int i=0;
        String binary = " ";
        while(temp>0) {
            int rem =temp%10;
            temp=temp/10;
            decimal = decimal + rem *(int) Math.pow(8, i++);
        }
        while(decimal >0) {
            int rem = decimal %2;
            decimal = decimal /2;
            binary= rem +binary;
        }
        System.out.println("Binary of " + Octal + " is " + binary);
    }
}
