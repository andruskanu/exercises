import java.util.Scanner;

public class OneChoiceQuestion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String question = "In the bible, Noah had three sons - can you name them?";
        String choiceOne = "a. Chase, Martin and Short";
        String choiceTwo = "b. Ham, Shem and Japhet";
        String choiceThree = "c. Steve, Martin and Chevy";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("Choose one of the following: \n" +
                choiceOne + ",\n" + choiceTwo + ",\n" + choiceThree + ".");

        String b = "b";
        System.out.print("Your choice: ");
        String choice = input.nextLine();

        if (choice.equals(b)) {
            System.out.println("Congrats! That's the correct answer!");
        } else {
            System.out.println("You are incorrect. The correct answer is " + correctAnswer);
        }
    }
}

