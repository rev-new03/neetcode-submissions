class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> check = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            int n = nums[i];
            if(!check.contains(n)){
                check.add(n);
            }else{
                return true;
            }
        }
        return false;
    }
}