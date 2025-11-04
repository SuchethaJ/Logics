package day1;

public class LeftRotateByTwo {
    public static void main(String[] args) {
        // Input array directly in the program
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int positions = 2; // rotate by 2 positions

        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Left rotation logic
        for (int i = 0; i < positions; i++) {
            int first = arr[0]; // store first element
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1]; // shift elements left
            }
            arr[n - 1] = first; // move first to end
        }

        System.out.println("\nArray after left rotation by 2 positions:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
