
class Solution {
    public void moveZeroes(int[] nums) {
       int insertPos = 0;
        for(int n:nums){
            if(n!=0)
                nums[insertPos++] = n;
        }
        for(int i=insertPos;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}