class Solution {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        while(n>0){
            if((n&1)==1)
                count++;
            n = n>>1;
        }
        return count==1;
    }
    //  public boolean isPowerOfTwo(int n) {
    //     if(n<=0)
    //         return false;
    //     return (n&(n-1)) == 0;
    // }
}