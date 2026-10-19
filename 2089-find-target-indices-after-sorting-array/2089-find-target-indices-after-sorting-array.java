class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> st = new ArrayList<>();

        for(int i = 0; i < nums.length;i++){
            if(nums[i] == target){
                st.add(i);
            }
        }
        return st;
    }
}