class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(prod(n) % t == 0){
                return n;
            }
            n++;
        }
    }
        public int prod(int n){
            int prod = 1;
            while(n != 0){
                int rem = n % 10;
                prod *= rem;
                n /= 10;
            }
            return prod;
        
    }
}

