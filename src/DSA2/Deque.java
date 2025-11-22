package DSA2;

public class Deque {

    int[] arr; int front, rear, size;

    public Deque(int cap) {
        arr = new int[cap];
        front = rear = -1;
        size = 0;
    }

    boolean isEmpty() { return size == 0; }
    boolean isFull()  { return size == arr.length; }

    void addFront(int x) {
        if (isFull()) { System.out.println("Deque full"); return; }
        if (isEmpty()) { front = rear = 0; }
        else front = (front - 1 + arr.length) % arr.length;
        arr[front] = x; size++;
    }

    void addRear(int x) {
        if (isFull()) { System.out.println("Deque full"); return; }
        if (isEmpty()) { front = rear = 0; }
        else rear = (rear + 1) % arr.length;
        arr[rear] = x; size++;
    }

    int removeFront() {
        if (isEmpty()) { System.out.println("Deque empty"); return -1; }
        int v = arr[front];
        if (size == 1) front = rear = -1;
        else front = (front + 1) % arr.length;
        size--; return v;
    }

    int removeRear() {
        if (isEmpty()) { System.out.println("Deque empty"); return -1; }
        int v = arr[rear];
        if (size == 1) front = rear = -1;
        else rear = (rear - 1 + arr.length) % arr.length;
        size--; return v;
    }

    void display() {
        if (isEmpty()) { System.out.println("Deque empty"); return; }
        System.out.print("Deque: ");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // sample input
        Deque d = new Deque(4);
        d.addFront(10); d.addRear(20); d.addRear(30); d.addFront(5);
        d.display();
        System.out.println("removeFront -> " + d.removeFront());
        System.out.println("removeRear -> " + d.removeRear());
        d.display();
    }
}


