class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end =arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) // Decreasing Part of Array
                end=mid;
            else  // Increasing Part of Array
                start=mid+1;
        }
        //In the end start == end and pointing to largest element
        return start;
    }
}