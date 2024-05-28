// Create Stack using LinkedList
// Declare Node class
public class Node {
    int number;
    Node next;
}

// Declare Stack class
public class Stack {
    // Declare the head of the stack
    Node headNode;

   // Declare push method
   public void push(int element) {
       Node newNode = new Node(element); // Create new node for new element
       newNode.next = headNode; // the node next of newNode point headNode
       headNode = newNode; // Update the value of the newNode by the value of the newNode
   }
}

