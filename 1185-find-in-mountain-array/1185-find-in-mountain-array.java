/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int ans =-1;
        int peak=peakInMountainArray(mountainArr);
        ans=binarySearch(mountainArr,target,0,peak,true);
        if(ans==-1)
            ans=binarySearch(mountainArr,target,peak+1,mountainArr.length()-1,false);
        return ans;
    }
    public int peakInMountainArray(MountainArray mountainArr){
        int start = 0, end =mountainArr.length()-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public int binarySearch(MountainArray arr,int target,int start,int end,boolean isAsc){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target == arr.get(mid))
                return mid;
            if(isAsc){
                if(target<arr.get(mid))
                    end=mid-1;
                else
                    start=mid+1;
            }
            else{
                if(target>arr.get(mid))
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return -1;
    }
}