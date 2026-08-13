class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length ;i++){//i=0:2
            int count = 1;
            for(int j = i; j<nums.length - 1; j++){
                int diff = nums[j+1] - nums[j];
                if(diff == 0){
                    continue;
                }
                if(diff == 1){
                    count++;
                }
                if(diff > 1){
                    break;
                }
                
            }
            result = Math.max(result, count);
        }
        return result;
    }
}
