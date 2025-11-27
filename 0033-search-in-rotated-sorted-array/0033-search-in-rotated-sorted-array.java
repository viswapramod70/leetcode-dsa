class Solution {
//    public static int search(int[] arr,int target) {
//         // Pivot is from which is the next numbers is ascending
// 		int pivot=findPivot(arr);
// 		//if you did not find a pivot, it means the array is not rotated, do normal binary search
// 		if(pivot==-1)
// 			return binarySearch(arr,target,0,arr.length-1);
		
// 		// if pivot is found , you found 2 asc sorted arrays
// 		if(arr[pivot]==target) {
// 			return pivot;
// 		}
		
//         // Since all numbers >pivot are smaller than start 
// 		if(target>=arr[0])
// 			return binarySearch(arr,target,0,pivot-1);
		

// 		return binarySearch(arr,target,pivot+1,arr.length-1);
// 	}
	
// 	public static int findPivot(int[] arr) {
// 		int start = 0, end=arr.length-1;
// 		while(start<=end) {
// 			int mid = start+(end-start)/2;
// 			if(mid<end && arr[mid]>arr[mid+1]) {
// 				return mid;
// 			}
// 			if(mid>start && arr[mid]<arr[mid-1]) {
// 				return mid-1;
// 			}
// 			if(arr[mid]<=arr[start]) {
// 				end=mid-1;
// 			}
// 			else {
// 				start=mid+1;
// 			}
			
// 		}
// 		return -1;
// 	}
	
// 	public static int binarySearch(int[] arr,int target,int start,int end) {
// 		while(start<=end) {
// 			int mid = start+(end-start)/2;
// 			if(target>arr[mid])
// 				start=mid+1;
// 			else if(target<arr[mid])
// 				end=mid-1;
// 			else
// 				return mid;
// 		}
// 		return -1;
// 	}

	public int search(int[] arr,int target) {
		int low = 0, high = arr.length-1;
		while(low<=high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == target)
				return mid;
			if(arr[low]<=arr[mid]) {
				if(arr[low]<=target && arr[mid]>target)
					high = mid-1;
				else
					low = mid+1;
			}
			else {
				if(arr[mid]<target && arr[high]>=target) {
					low = mid+1;
				}
				else
					high = mid -1;
			}
		}
		return -1;
	}
}