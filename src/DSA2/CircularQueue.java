package DSA2;

public class CircularQueue {

    int[] arr;       // Array to store queue elements
    int front = 0;   // Index from where we remove (dequeue)
    int rear = 0;    // Index where we insert (enqueue)
    int size = 0;    // Number of elements currently in queue

    // Constructor to initialize queue with capacity
    CircularQueue(int cap) {
        arr = new int[cap];
    }

    // Add element at rear (circular)
    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue full");
            return;
        }

        arr[rear] = x;                       // Insert element
        rear = (rear + 1) % arr.length;      // Move rear circularly
        size++;                               // Increase size
    }

    // Remove element from front (circular)
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return -1;
        }

        int val = arr[front];                // Get front element
        front = (front + 1) % arr.length;    // Move front circularly
        size--;                               // Decrease size
        return val;
    }

    // Check if queue is empty
    boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    boolean isFull() {
        return size == arr.length;
    }

    // Display the queue elements (for understanding)
    void display() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % arr.length; // circular display
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    // MAIN method for testing
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(3);

        System.out.println("isEmpty: " + q.isEmpty()); // true

        q.enqueue(11); // front=0, rear=1
        q.enqueue(22); // front=0, rear=2
        q.enqueue(33); // front=0, rear=0 (wrap), full

        System.out.println("isFull: " + q.isFull());   // true
        q.display();

        System.out.println("dequeue: " + q.dequeue()); // removes 11 → front=1
        q.display();

        q.enqueue(44); // rear moves to 1 (circular) because a slot freed
        q.display();

        System.out.println("dequeue: " + q.dequeue()); // removes 22
        q.display();
    }
}

