class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<=nums.length-1; i++){
            int currentNum = nums[i];
            int diff = target - currentNum;
            if(map.containsKey(diff)){
              int value = map.get(diff);
              return new int[]{value, i};
            }else{
                map.put(currentNum,i);
            }
        }
        return new int[] {};
    }
}
