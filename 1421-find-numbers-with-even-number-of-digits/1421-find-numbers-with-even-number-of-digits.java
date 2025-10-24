class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(numDigits(nums[i])%2==0)
                count++;
        }
        return count;
    }
    public static int numDigits(int n){
        return (int)Math.log10(n)+1;
    }
}