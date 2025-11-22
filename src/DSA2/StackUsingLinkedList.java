package DSA2;

public class StackUsingLinkedList {
    // Node for LinkedList
    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    Node top; // head of list acts as stack top

    boolean isEmpty() {
        return top == null;
    }

    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top; // new node points to old top
        top = newNode;      // update top
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack empty");
            return -1;
        }
        int val = top.data;
        top = top.next;     // move top
        return val;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack empty");
            return -1;
        }
        return top.data;
    }

    void display() {
        Node temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingLinkedList st = new StackUsingLinkedList();

        st.push(5);
        st.push(15);
        st.push(25);

        st.display();

        System.out.println("Pop: " + st.pop());
        System.out.println("Peek: " + st.peek());
    }
}

