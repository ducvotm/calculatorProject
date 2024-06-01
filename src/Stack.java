// Create Stack using LinkedList
// Declare Stack class
public class Stack {
    // Declare the head of the stack
    Node headNode;

    // Declare push method
    public void push(int element) {
        Node newNode = new Node(); // Create new node for new element

        newNode.number = element; // Setting the number field of the new Node
        newNode.next = headNode; // the node next of newNode point headNode

        headNode = newNode; // Update the value of the newNode by the value of the newNode
    }

    // Declare pop method
    public void pop() {
            headNode = headNode.next; // Point the head node to the second element in the Stack
        }

    // Print the stack
    public void printStack() {
        // Declare tempNode to traverse the Stack
        Node tempNode = headNode;

        // Ensure the stack is empty
        while (tempNode != null) {
            // Print the number field of the node
            System.out.printf("%d, ", tempNode.number);

            // Move to the next node in stack
            tempNode = tempNode.next;
        }
    }
}
