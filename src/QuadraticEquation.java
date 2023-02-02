import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double x1, x2, delta;

        System.out.print("Input 1st element: ");
        a = sc.nextInt();
        System.out.print("Input 2nd element: ");
        b = sc.nextInt();
        System.out.print("Input 3rd element: ");
        c = sc.nextInt();

        delta = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b - Math.sqrt(delta)) / (2 * a);
        x2 = (-b + Math.sqrt(delta)) / (2 * a);

        if (delta > 0) {
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Delta negative");
            System.exit(0);
        }
    }
}
