class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.length() == 0){
            return 0;
        }
        String a[] = s.split("\\s+");
        return a.length;
    }
}