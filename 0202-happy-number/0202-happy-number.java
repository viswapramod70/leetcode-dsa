class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = squareOfDigits(slow);
            fast = squareOfDigits(squareOfDigits(fast));
        }while(slow!=fast);
        if(slow == 1)
            return true;
        return false;
    }
    public int squareOfDigits(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans += rem*rem;
            n/=10;
        }
        return ans;
    }
}