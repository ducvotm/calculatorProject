import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        // Input the expression
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        // Ensure the expression is valid
        if (isValid(expression)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean isValid(String input) {
        // Declare variable to check the status of validate
        boolean validateStatus = true;
        for (int i = 0; i < input.length(); i++) {
            String element = Character.toString(input.charAt(i));
            // Numeric checking and sign checking
            if (!element.matches("\\d") && !element.matches("[\\+\\-\\*/()]")) {
                validateStatus = false;
                break;
            }
        }
        return validateStatus;
    }
}




