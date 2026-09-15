// class Solution {
//     public boolean checkDivisibility(int n) {
//         int k = n;
//         int b = n;
        
//         if(n % sum(k) == 0 && n % prod(b) == 0){
//             return true;
//         }
//             return false;
//     }
    
//         public int sum(int k){
//             int sum = 0;
//             while(k != 0){
//                 int rem = k % 10;
//                 sum += rem;
//                 k /= 10;
//             }
//             return sum;
//         }
//         public int prod(int b){
//             int prod = 1;
//             while(b != 0){
//                 int rem = b % 10;
//                 prod *= rem;
//                 b /= 10;
//             }
//             return prod;
//     }
// }

class Solution {

    public boolean checkDivisibility(int n) {

        int k = n;
        int b = n;

        if (n % (sum(k) + prod(b)) == 0) {
            return true;
        }

        return false;
    }

    public int sum(int k) {

        int sum = 0;

        while (k != 0) {
            int rem = k % 10;
            sum += rem;
            k /= 10;
        }

        return sum;
    }

    public int prod(int b) {

        int prod = 1;

        while (b != 0) {
            int rem = b % 10;
            prod *= rem;
            b /= 10;
        }

        return prod;
    }
}