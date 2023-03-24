package palindrome;

import java.util.Scanner;

public class PalindromeMethods {

    static Scanner sc = new Scanner(System.in);

    public static void checkText() {
        System.out.print("text = ");
        String text = sc.nextLine();
        String reverse = "";

        for (int i = (text.length() - 1); i >= 0; --i) {
            reverse = reverse + text.charAt(i);
        }

        if (text.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println(text + " is Palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }

    public static void checkNumber() {

        System.out.print("number = ");
        int myNumber = sc.nextInt();

        int initialNumber = myNumber;
        int aux;
        int reverse = 0;

        while (myNumber != 0) {
            aux = myNumber % 10;
            reverse = reverse * 10 + aux;
            myNumber = myNumber / 10;
        }

        if (reverse == initialNumber) {
            System.out.println(initialNumber + " is Palindrome");
        } else {
            System.out.println(initialNumber + " is not Palindrome");
        }
    }
}