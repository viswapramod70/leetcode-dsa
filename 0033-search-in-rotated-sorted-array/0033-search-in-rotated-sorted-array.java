class Solution {
   public static int search(int[] arr,int target) {
		int pivot=findPivot(arr);
		//if you did not find a pivot, it means the array is not found, do normal binary search
		if(pivot==-1)
			return binarySearch(arr,target,0,arr.length-1);
		
		// if pivot is found , you found 2 asc sorted arrays
		if(arr[pivot]==target) {
			return pivot;
		}
		
		if(target>=arr[0])
			return binarySearch(arr,target,0,pivot-1);
		
		return binarySearch(arr,target,pivot+1,arr.length-1);
	}
	
	public static int findPivot(int[] arr) {
		int start = 0, end=arr.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			else if(mid>start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			if(arr[mid]<=arr[start]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr,int target,int start,int end) {
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(target>arr[mid])
				start=mid+1;
			else if(target<arr[mid])
				end=mid-1;
			else
				return mid;
		}
		return -1;
	}
}