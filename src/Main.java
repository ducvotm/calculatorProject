import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        // Input the expression
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        // Declare stack to keep the polish notation
        Stack numStack = new Stack();
        Stack opStack = new Stack();

        // Ensure the expression is valid
        if (!isValid(expression)) {
            System.out.println("The expression is not valid");
        } else {
            // Traverse the expression
            for (int i = 0; i < expression.length(); i++) {
                String element = Character.toString(expression.charAt(i));

                // Whether encounter an operand,
                if (isOperand(element)) {
                    // Push it into the stack
                    numStack.push(element);
                }
                // If it's an operator,
                if (isOperator(element)) {
                    // Check if it is the first element of the stack
                    if (opStack.isEmpty()) {
                        opStack.push(element);
                    //compare its precedence with the operator on the top of opStack.
                    } else {
                        // If it's higher, push it into opStack.
                        if (getRank(element) > getRank(opStack.peek())) {
                            opStack.push(element);

                        // If it's lower or equal, pop operators from opStack and numbers from numStack,
                        } else {
                            // push the new operator to the opStack
                            String operator = opStack.pop();
                            // Check if it is the first at numStack
                            if (!numStack.isFirst()){
                                int left = Integer.parseInt(numStack.pop());
                                int right = Integer.parseInt(numStack.pop());

                                // until the operator on the top of opStack has lower precedence. Then, push the current operator into opStack.
                                // Stop here
                                /*do {
                                    // perform the operations, and push the result back into numStack,
                                    String result = Integer.toString(getResult(operator, left, right));
                                    numStack.push(result);
                                } while (getRank(element) > getRank(opStack.peek()));
                                opStack.push(element);
                                 */
                            }
                        }
                    }
                }
            }
        }
        opStack.printStack();
        System.out.println(" ");
        numStack.printStack();
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

    public static boolean isOperand(String element) {
        boolean operandStatus = false;
        if (element.matches("[0-9]")) {
            operandStatus = true;
        }
        return operandStatus;
    }

    public static boolean isOperator(String element) {
        boolean operatorStatus = false;
        if (element.matches("[\\+\\-\\*/]")) {
            operatorStatus = true;
        }
        return operatorStatus;
    }

    public static int getRank(String operator) {
       if (operator == "*" || operator == "/") {
           return 3;
       } else if (operator == "+" || operator == "-") {
           return 2;
       } else if (operator == "(" || operator == ")") {
           return 1;
       } else {
           return 0;
       }
    }

    public static int getResult(String operator, int left, int right) {
        switch (operator) {
            case "+":
               return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
            default:
                return -1;
        }
    }
}




