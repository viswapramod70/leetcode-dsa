class Solution {
    	public int splitArray(int[] nums, int k) {
		int start = 0, end = 0;
		for(int i=0;i<nums.length;i++) {
			start = Math.max(start, nums[i]);	//In the end of loop this will contain max item for the array
			end += nums[i];
		}
		
//		Binary Search
		while(start<end) {
			int mid = start +(end-start)/2;
			
//			calculate how many pieces you can divide this in with this max sum
			int sum =0;
			int pieces = 1;
			
			for(int num:nums) {
				if(sum+num>mid) {
					// if the sum exceeds mid we can't add it in this subarray, create new one
					// if we add this num in new subarray, then sum = num
					sum = num;
					pieces++;
				}
				else {
					sum += num;
				}
			}
			
			if(pieces>k) {
				start = mid + 1;
			}
			else {
				end = mid;
			}
		}
		return end;
		
	}
}