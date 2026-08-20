class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int currentNum = nums[i]; //6
            int diff = target - currentNum; //4
            if(map.containsKey(diff)){ 
                int value = map.get(diff);//0
                return new int[] {value, i};
            }else{
                map.put(currentNum, i);
            }
        }
        return new int[] {0,0};
    }
}
