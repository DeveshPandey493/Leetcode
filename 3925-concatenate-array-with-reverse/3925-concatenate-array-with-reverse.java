class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[] = new int[nums.length * 2];
        for(int i = 0;  i < nums.length;i++){
            arr[i] = nums[i];
        }
        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        for(i = 0; i < nums.length;i++){
            arr[nums.length + i] = nums[i];
        }
        return arr;
    }
}