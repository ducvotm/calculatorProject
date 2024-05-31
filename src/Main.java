public class Main {
       public static void main(String[] args) {
           Stack testStack = new Stack();

           // Puss 9 element to the stack
           for (int element = 0; element < 10; element++) {
               testStack.push(element);
           }

           // Pop the item
           testStack.pop();

           // Print the Stack
           testStack.printStack();
       }
}


