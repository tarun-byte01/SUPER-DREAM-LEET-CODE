class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        
        long sum = 0;
        long F = 0;
        
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            F += (long)i * nums[i];
        }
        
        long result = F;
        
        for(int k = 1; k < n; k++) {
            F = F + sum - (long)n * nums[n - k];
            result = Math.max(result, F);
        }
        
        return (int)result;
    }
}
Given:

nums = [4, 3, 2, 6]

Define:

F(0) = 0×4 + 1×3 + 2×2 + 3×6 = 22

Then rotate right:

[6, 4, 3, 2]
F(1) = 0×6 + 1×4 + 2×3 + 3×2 = 16
