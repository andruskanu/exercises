import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int n, counter;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = scanner.nextInt();

        System.out.print("Prime numbers between 1 to " + n + " are: ");
        for (int i = 2; i <= n; i++) {
            counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2)
                System.out.print(i + " ");
        }
    }
}