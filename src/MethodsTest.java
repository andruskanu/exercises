public class MethodsTest {

    public static void main(String[] args) {

        int[] myArray = new int[8];

        System.out.print("My myArray: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        System.out.println("Sum of twoNumbers: " + addTwoNumbers(4, 5));
        System.out.println("Sum of myArray: " + sum(myArray));
        System.out.println("Average of myArray: " + avg(myArray));
        System.out.println("The position of number is: " + search(5, myArray));
    }

    public static int addTwoNumbers(int i, int j) {
        return i + j;
    }

    public static int sum(int[] vector) {
        int sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static double avg(int[] vector) {
        double avg = 0;
        for (int i = 0; i < vector.length; i++) {
            avg = avg + i;
        }
        avg = avg / vector.length;
        return avg;
    }

    public static int search(int n, int[] vector) {
        int index = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == n) {
                index = i;
                break;
            }
        }
        return index;
    }
}
