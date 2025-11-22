package DSA2;

// SlidingWindowMax.java
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (k > n) return new int[0];
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>(); // store indices, decreasing values

        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peekFirst() == i - k) dq.pollFirst();
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1) ans[i - k + 1] = nums[dq.peekFirst()];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(arr, k)));
    }
}

