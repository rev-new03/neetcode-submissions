class Solution {
    public int[] productExceptSelf(int[] nums) {
        int finalProduct = 1;
        int zeroCount = 0;
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
            }else{
                finalProduct = finalProduct * nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(zeroCount > 1){
                result[i] = 0;
            }else if(zeroCount == 1){
                if(nums[i] == 0){
                    result[i] = finalProduct;
                }else{
                    result[i] = 0;
                }
            }
                else{
                    result[i] = finalProduct / nums[i];
                    }
              }
        return result;
            
    }
}

// write 2 loops, take each index for i and make it as an exception while iterating over in j loop
// after calculating complete product of the values, divide the final o/p by each of the value