package DSA2;

// MonotonicStackDemo.java
import java.util.Arrays;
import java.util.Stack;

public class MonotonicStackDemo {
    // next greater to right
    public static int[] nextGreater(int[] nums) {
        int n = nums.length, ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return ans;
    }

    // next smaller to right
    public static int[] nextSmaller(int[] nums) {
        int n = nums.length, ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= nums[i]) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("nextGreater: " + Arrays.toString(nextGreater(arr)));
        System.out.println("nextSmaller: " + Arrays.toString(nextSmaller(arr)));
    }
}


