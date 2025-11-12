class Solution {
    // public boolean isHappy(int n) {
    //     int slow = n;
    //     int fast = n;
    //     do{
    //         slow = squareOfDigits(slow);
    //         fast = squareOfDigits(squareOfDigits(fast));
    //     }while(slow!=fast);
    //     if(slow == 1)
    //         return true;
    //     return false;
    // }
    // public int squareOfDigits(int n){
    //     int ans = 0;
    //     while(n>0){
    //         int rem = n%10;
    //         ans += rem*rem;
    //         n/=10;
    //     }
    //     return ans;
    // }
     public boolean isHappy(int n) {
        while(n > 9){
            int sum = 0;
            while(n > 0){
                sum += (n % 10) * (n % 10);
                n /= 10;               
            }
            n = sum;
        }
        return n == 1 || n == 7;
    }
}