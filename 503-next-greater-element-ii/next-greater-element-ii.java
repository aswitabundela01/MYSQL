import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nxtG = new int[n];
        Stack<Integer> s = new Stack<>();

        Arrays.fill(nxtG, -1);
        for (int i = 0; i < 2 * n; i++) {
            int idx = i % n;

            while (!s.isEmpty() && nums[s.peek()] < nums[idx]) {
                nxtG[s.pop()] = nums[idx];
            }

            if (i < n) {
                s.push(idx);
            }
        }

        return nxtG;
    }
}
