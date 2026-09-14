// class Solution {
//     public boolean kLengthApart(int[] nums, int k) {
//         int arr[] = new int[nums.length];
//         int idk = 0;
//         for(int i = 0; i < nums.length;i++){
//             if(nums[i] == 1){
//                 arr[i] = i;
//                 idk++;
//             }
//         }
//         for(int i = 0; i < idk ;i++){
//             if(arr[i+1] - arr[i] >= k){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

class Solution {

    public boolean kLengthApart(int[] nums, int k) {

        int arr[] = new int[nums.length];

        int idk = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 1) {
                arr[idk] = i;
                idk++;
            }
        }

        for(int i = 0; i < idk - 1; i++) {

            if(arr[i + 1] - arr[i] - 1 < k) {
                return false;
            }
        }

        return true;
    }
}