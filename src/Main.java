public class Main {
    public static void main(String[] args) {
           Stack testStack = new Stack();
           Queue testQueue = new Queue();

           // Adding
           for (int element = 0; element < 10; element++) {
               testStack.push(element);
               testQueue.add(element);
           }

           // Remove
           testStack.pop();
           testQueue.remove();

           // Print
           System.out.print("Stack: ");
           testStack.printStack();

           System.out.println();

           System.out.print("Queue: ");
           testQueue.printQueue();
       }
}


