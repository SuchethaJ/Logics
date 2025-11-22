package DSA2;

// MinStack.java
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> mins = new Stack<>();

    public void push(int x) {
        stack.push(x);
        if (mins.isEmpty() || x <= mins.peek()) mins.push(x);
    }

    public void pop() {
        if (stack.isEmpty()) { System.out.println("empty"); return; }
        if (stack.peek().equals(mins.peek())) mins.pop();
        stack.pop();
    }

    public int top() {
        if (stack.isEmpty()) { System.out.println("empty"); return -1; }
        return stack.peek();
    }

    public int getMin() {
        if (mins.isEmpty()) { System.out.println("empty"); return -1; }
        return mins.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(5); ms.push(3); ms.push(7);
        System.out.println("min -> " + ms.getMin());
        ms.pop();
        ms.pop();
        System.out.println("min -> " + ms.getMin());
    }
}

