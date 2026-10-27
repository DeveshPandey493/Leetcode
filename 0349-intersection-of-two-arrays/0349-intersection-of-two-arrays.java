class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int x : nums2){
            if(set1.contains(x)){
                set2.add(x);
            }
        }
        int result[] = new int[set2.size()];
        int i = 0;
        for(int y : set2){
            result[i++] = y;
        }
        return result;

    }
}