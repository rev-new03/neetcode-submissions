class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        int result = 1;
        
        for(int i =0; i<nums.length; i++){
            int n = nums[i];
            set.add(n);
        }
        
        for(int n:set){
            int length = 1;
        while(!set.contains(n-1)){
            if(set.contains(n+length)){
                length++;
            }else{
                break;
            }
            result = Math.max(result, length);
        }
        }
        return result;
    }
}
