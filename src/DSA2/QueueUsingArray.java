package DSA2;

public class QueueUsingArray {

    int[] arr;      // storage
    int front = 0;  // index for next dequeue
    int rear = -1;  // index of last inserted element
    int size = 0;   // current number of elements

    QueueUsingArray(int cap){
        arr = new int[cap];
    }

    // enqueue at rear
    void enqueue(int x){
        if (isFull()) {
            System.out.println("Queue full");
            return;
        }
        arr[++rear] = x;
        size++;
    }

    // dequeue from front
    int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue empty");
            return -1;
        }
        int val = arr[front++];
        size--;
        return val;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == arr.length;
    }

    // Testing in main
    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(3);

        System.out.println("isEmpty: " + q.isEmpty());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("isFull: " + q.isFull());
        System.out.println("dequeue: " + q.dequeue());
        System.out.println("dequeue: " + q.dequeue());
    }
}

