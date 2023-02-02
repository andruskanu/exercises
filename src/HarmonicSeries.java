import java.util.Scanner;

public class HarmonicSeries {

    public static void main(String[] args) {
        int n;
        double h = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input n = ");
        n = sc.nextInt();

        while (n == 0) {
            System.out.println("Wrong answer! Input n > 0");
            System.out.print("Input n = ");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            h = h + ((double) 1 / i);
        }
        System.out.println("Harmonic series is: " + h);
    }
}
