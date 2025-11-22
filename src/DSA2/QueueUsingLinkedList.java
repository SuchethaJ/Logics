package DSA2;

public class QueueUsingLinkedList {

    // Node class
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
        }
    }

    Node front, rear;

    // insert at rear
    void enqueue(int x) {
        Node n = new Node(x);

        if (rear == null) { // queue is empty
            front = rear = n;
        } else {
            rear.next = n;   // link new node
            rear = n;        // update rear
        }
    }

    // remove from front
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return -1;
        }

        int val = front.data;
        front = front.next;

        if (front == null) rear = null; // queue became empty

        return val;
    }

    boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();

        System.out.println("isEmpty: " + q.isEmpty());
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("isEmpty: " + q.isEmpty());
        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20
    }
}
