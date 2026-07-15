class Solution {
    public int[] runningSum(int[] nums) {
        int arr[] = new int[nums.length];
        arr[0] = nums[0]; 
        for(int i = 0; i < nums.length; i++){

            for(int j = i+1; j < nums.length; j++){

                arr[j] = arr[i] + nums[j];

            }

        }
        return arr;
    }
}