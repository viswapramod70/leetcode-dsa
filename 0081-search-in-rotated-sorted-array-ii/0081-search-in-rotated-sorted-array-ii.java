class Solution {
    public boolean search(int[] nums, int target) {
        int pivot=findPivotWithDuplicates(nums);
		//if you did not find a pivot, it means the array is not found, do normal binary search
		if(pivot==-1)
			return binarySearch(nums,target,0,nums.length-1);
		
		// if pivot is found , you found 2 asc sorted arrays
		if(nums[pivot]==target) {
			return true;
		}
		
		if(target>=nums[0])
			return binarySearch(nums,target,0,pivot-1);
		
		return binarySearch(nums,target,pivot+1,nums.length-1);
	}
	
	public int findPivotWithDuplicates(int[] arr) {
		int start = 0, end=arr.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			else if(mid>start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			// If elements at middle, start, end are equal then just skip the duplicates
			if(arr[mid]==arr[start] && arr[mid]==arr[end]) {
				//check if start is pivot
				if(start<end && arr[start]>arr[start+1])
					return start;
				start++;
				//check if end is pivot
				if(end>start && arr[end]<arr[end-1])
					return end-1;
				end--;
			}
			// left side is sorted, so pivot should be in right
			else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])) {
				start = mid+1;
			}
			else {
				end=mid-1;
			}
			
		}
		return -1;
	}
	
	public boolean binarySearch(int[] arr,int target,int start,int end) {
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(target>arr[mid])
				start=mid+1;
			else if(target<arr[mid])
				end=mid-1;
			else
				return true;
		}
		return false;
	}
}