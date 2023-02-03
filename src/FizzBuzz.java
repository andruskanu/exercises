package livecoding;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number");
        System.out.print("n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("FizzBuzz" + " ");
            } else if (i % 7 == 0) {
                System.out.print("buzz" + " ");
            } else if (i % 3 == 0) {
                System.out.print("fizz" + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
