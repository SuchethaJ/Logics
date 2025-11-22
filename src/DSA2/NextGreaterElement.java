package DSA2;

// NextGreaterElement.java
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreater(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>(); // store values (monotonic decreasing)

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25}; // sample input
        System.out.println(Arrays.toString(nextGreater(arr)));
    }
}
