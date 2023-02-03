import java.util.Scanner;

public class SpaceCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the text: ");
        String text = sc.nextLine();

        int textLength = text.length();
        int spaceCounter = 0;
        float percent;

        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                spaceCounter++;
            }
        }
        System.out.println("Text length is: " + textLength);
        System.out.println("Number of spaces is: " + spaceCounter);

        percent = ((float) spaceCounter * 100 / textLength);
        System.out.println("Percentage of space is: " + percent);

    }
}
