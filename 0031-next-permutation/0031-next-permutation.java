class Solution {
    	public void nextPermutation(int[] nums) {
		int ind = -1, n = nums.length;
//		1. Longer Prefix Match 
		for(int i = n-2;i>=0;i--) {
			if(nums[i]<nums[i+1]) {
				ind = i;
				break;
			}
		}
		if(ind==-1) {
			rev(nums,0,n-1);
			return;
		}
//		2. Find smallest element greater than ind and swap
		for(int i = n-1;i>ind;i--) {
			if(nums[i]>nums[ind]) {
				swap(nums,i,ind);
				break;
			}
		}
//		3. Since in permutation it will always be sorted we need to reverse the remaining
		rev(nums,ind+1,n-1);
	}
	public void swap(int[] nums,int i,int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public void rev(int[] nums,int start,int end) {
		
		while(start<end) {
			swap(nums,start,end);
			start++;
			end--;
		}
	}
}