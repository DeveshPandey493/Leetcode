class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char part[] = s.toCharArray();
        char word[] = new char[part.length];
        for(int i = 0; i < part.length;i++){
            word[i] = part[i];
        }
        int i = 0;
        int j = part.length - 1;
        while(i < j){
            char temp = part[i];
            part[i] = part[j];
            part[j] = temp;
            i++;
            j--;
        }
        return Arrays.equals(word,part);

        
    }
}
