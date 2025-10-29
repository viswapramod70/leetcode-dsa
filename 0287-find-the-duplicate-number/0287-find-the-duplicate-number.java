class Solution {
    // public int findDuplicate(int[] nums) {
    //     int hare=0,tortoise=0;
    //     do
    //     {
    //         tortoise=nums[tortoise];
    //         hare=nums[nums[hare]];
    //     }while(tortoise!=hare);
    //     tortoise=0;
    //     while(tortoise!=hare)
    //     {
    //         tortoise=nums[tortoise];
    //         hare=nums[hare];
    //     }
    //     return tortoise;
    // }
    public int findDuplicate(int[] nums){
        //cyclic sort
        int i=0, count = 0;
        while(i<nums.length){
            if(nums[i] != i+1){
                int correct_index = nums[i]-1;
                if(nums[i]!=nums[correct_index])
                    swap(nums,i,correct_index);
                else
                    return nums[i];
            }
            else
                i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1)
                count++;
        }
        return count;
    }
    public void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}