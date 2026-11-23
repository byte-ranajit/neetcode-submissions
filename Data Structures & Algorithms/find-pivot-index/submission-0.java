class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int prefixSum = 0;
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            int left = prefixSum;
            int right = totalSum - left - nums[i];
            if(left == right){
                return i;
            }
            prefixSum += nums[i];
        }
        return -1;
    }
}