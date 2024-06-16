// Create Stack using LinkedList
// Declare Stack class
public class Stack {
    // Declare the head of the stack
    Node headNode;

    // Declare push method
    public void push(String element) {
        Node newNode = new Node(); // Create new node for new element

        newNode.data = element; // Setting the data field of the new Node
        newNode.next = headNode; // the node next of newNode point headNode =>> b/c both point to null

        headNode = newNode; // Update the value of the headNode by the value of the newNode
    }

    // Declare pop method (have practice feedback from Coach)
    public String pop() {
        if (isEmpty()) {
            return null;
        } else {
            Node tempNode = headNode;
            headNode = headNode.next; // Point the head node to the second element in the Stack
            return tempNode.data;
        }
        // return null + message =>>
    }

    // Declare checking if it is the first element
    public boolean isEmpty() {
        if (headNode == null) {
            return true;
        }
        return false;
    }

    // Declare checking if it is the firstc element
    public boolean isFirst() {
        if (headNode.next == null) {
            return true;
        }
        return false;
    }


    // Declare top Stack
    public String peek() {
        return headNode.data;
    }

    // Print the stack
    public void printStack() {
        // Declare tempNode to traverse the Stack
        Node tempNode = headNode;

        // Ensure the stack is empty
        while (tempNode != null) {
            // Print the number field of the node
            System.out.printf("%s, ", tempNode.data);

            // Move to the next node in stack
            tempNode = tempNode.next;
        }
    }
}
