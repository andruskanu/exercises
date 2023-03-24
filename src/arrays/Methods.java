package arrays;

import java.util.Scanner;

public class Methods {

    Scanner sc = new Scanner(System.in);

    {
        System.out.print("n = ");
    }

    int n = sc.nextInt();

    {
        System.out.print("m = ");
    }

    int m = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[m];
    int s1 = 0;
    int s2 = 0;


    public void read() {

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = sc.nextInt();
            s1 = s1 + a[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "]= ");
            b[i] = sc.nextInt();
            s2 = s2 + b[i];
        }
    }

    public void display() {
        System.out.print("First array -> a[" + n + "] = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.print("Second array -> b[" + n + "] = ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

    public void compare() {
        System.out.print("Result: ");
        if (s1 == s2) {
            System.out.println("OKAY");
        } else {
            System.out.println("NOT OKAY");
        }
    }
}
