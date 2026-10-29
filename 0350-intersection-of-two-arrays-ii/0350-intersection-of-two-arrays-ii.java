class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> st = new ArrayList<>();
        for(int i : nums1){
            st.add(i);
        }
        List<Integer> st1 = new ArrayList<>();
        for(int x : nums2){
            if(st.contains(x)){
                st1.add(x);
                st.remove(Integer.valueOf(x));
            }
        }
        int res[] = new int[st1.size()];
        int i = 0;
        for(int x : st1){
            res[i++] = x;
        }
        return res;
    }
}