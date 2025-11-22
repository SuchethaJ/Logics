package DSA2;

import java.util.Stack;

public class StackUsingArray {
    int[] arr;
    int top;

    public StackUsingArray(int size){
        arr =new int[size];
        top=-1;
    }
    public boolean isempty(){
        return top==-1;
    }
    public boolean isfull(){
        return top==arr.length-1;
    }
    public void push(int no){
        if(isfull()){
            System.out.println("stack is full");
        }
        else {
            arr[++top]=no;
        }
    }
    public void pop(){
        if(isempty()){
            System.out.println("stack is empty");
        }
        else{
            int ele=arr[top];
            top=top-1;
            System.out.println(ele);
        }
    }
    public void peek(){
        if(isempty()){
            System.out.println("stack is empty");
        }
        else{
            System.out.println(arr[top]);
        }
    }
    public void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        StackUsingArray st=new StackUsingArray(3);
        System.out.println("Is stack empty: " + st.isempty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();

        System.out.println("Is stack empty: " + st.isempty());
        System.out.print("removed element: ");
        st.pop();

        System.out.print("the top element is: ");
        st.peek();
    }
}
