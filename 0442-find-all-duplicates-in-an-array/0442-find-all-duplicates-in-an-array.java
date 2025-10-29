class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct_index=nums[i]-1;
            if(nums[i]!=nums[correct_index])
                swap(nums,i,correct_index);
            else
                i++;
        }
        List<Integer> ls = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=(j+1))
                ls.add(nums[j]);

        }
        return ls;
    }
    public void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}