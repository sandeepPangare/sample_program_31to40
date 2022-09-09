import java.util.Scanner;

public class QuadrantInGivenCoardinateLies {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of X");
        int x = scanner.nextInt();

        System.out.println("Enter value of Y");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("X and Y lies on Quadrant I");

        } else if (x < 0 && y > 0) {

            System.out.println("X and Y lies on Quadrant II");

        } else if (x < 0 && y < 0) {

            System.out.println("X and Y lies on Quadrant III");

        } else if (x > 0 && y < 0) {
            System.out.println("X and Y lies on Quadrant IV");

        } else if (x == 0 && y == 0) {

            System.out.println("X and Y lies on Origin");

        } else if (y == 0 && x !=0) {

            System.out.println("X and Y lies on x-axis");

        } else if (x == 0 && y != 0) {

            System.out.println("X and Y lies on y-axis");
        }
    }
}
