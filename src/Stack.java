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
            headNode = headNode.next;
        }

    // Print the stack
    public void printStack() {
        Node tempNode = headNode;

        while (tempNode != null) {
            System.out.println(tempNode.number);
            tempNode = tempNode.next;
        }
    }
}
