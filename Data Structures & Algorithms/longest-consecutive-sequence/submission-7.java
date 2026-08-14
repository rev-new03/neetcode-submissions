class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) { // i=0:2
            
            int diff = nums[i + 1] - nums[i];
            if (diff == 0) {
                continue;
            }
            if (diff == 1) {
                count++;
            }
            if (diff > 1) {
                count = 1;
            }
            result = Math.max(result, count);
        }
        return result;
    }
}
