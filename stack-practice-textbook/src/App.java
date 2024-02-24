import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String input = scnr.nextLine();

        Reverser reverse = new Reverser(input);

        String reverseComplete = reverse.doReverse();
        System.out.println(reverseComplete);
    }
}
