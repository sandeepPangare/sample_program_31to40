import java.util.Scanner;

public class BinaryToOctalConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary Number");
        int binary =sc.nextInt();
        int decimal =0;
        int temp= binary;
        int i=0;
        String octal = " ";
        while(temp>0) {
            int rem =temp%10;
            temp=temp/10;
            decimal = decimal + rem *(int) Math.pow(2, i++);
        }
        while(decimal >0) {
            int rem = decimal %8;
            decimal = decimal /8;
            octal= rem +octal;
        }
        System.out.println("octal of " + binary + " is " + octal);
    }
}
