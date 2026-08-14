class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        return 0;
        Arrays.sort(nums);
        int result = 0;
        int count = 1;
        for(int i = 0; i<nums.length - 1; i++){
            int diff = nums[i + 1] - nums[i];
            if(diff == 0){
                continue;
            }
            if(diff == 1){
                count++;
            }
            if(diff > 1){
                result = Math.max(result,count);
                count = 1;
            }
        }
        return Math.max(result, count);
    }
}
