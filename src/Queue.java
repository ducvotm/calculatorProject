// Create Queue class manually using linked List
public class Queue {
    // Declare the headNode to keep track the head of the Queue
    Node headNode;

    // Declare the tailNode to keep track the end of the Queue
    Node tailNode;

   // Declare enqueue method to insert new element to the end of the end of the list
    public void add(String element) {
        // Declare newNode for new elements
        Node newNode = new Node();

        // Declare each field of newNode to the end of the Queue
        newNode.data = element;
        newNode.next = null;

        // Checking if the element is the first one
        if (tailNode == null || headNode == null) {
            // Point the tailNode to the newNode
            tailNode = newNode;

            // Point the headNode to the newNode
            headNode = newNode;
        } else {
            // Update the next element as the sequence in the Queue
            tailNode.next = newNode;

            // Update the newNode as the newTail of the Queue
            tailNode = newNode;
        }
    }

    // Declare remove method
    public void remove() {
        headNode = headNode.next; // Point the head node to the second element in the Stack
    }

    // Declare the print method
    public void printQueue() {
        // Create a tempNode to traverse the Queue
        Node tempNode = headNode;

        // Checking if the Queue is empty
        while (tempNode != null) {
            // Print the number field of the node
            System.out.printf("%s, ",tempNode.data);

            // Move to the next Node
            tempNode = tempNode.next;
        }
    }
}
