class Solution {
    public int maxRotateFunction(int[] nums) {

        int n = nums.length;

        int sum = 0;
        int f = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            f += i * nums[i];
        }

        int max = f;

        for (int k = 1; k < n; k++) {
            f = f + sum - n * nums[n - k];

            max = Math.max(max, f);
        }

        return max;
    }
}

Given:

nums = [4, 3, 2, 6]

Define:

F(0) = 0×4 + 1×3 + 2×2 + 3×6 = 22

Then rotate right:

[6, 4, 3, 2]
F(1) = 0×6 + 1×4 + 2×3 + 3×2 = 16
