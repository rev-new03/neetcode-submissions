class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> duplicate = new HashMap<>();
        for(int i = 0; i<=nums.length-1; i++){
            int n = nums[i];
            if(duplicate.containsKey(n)){
                return true;
            }else{
                duplicate.put(n,true);
            }
        }
        return false;
    }
}