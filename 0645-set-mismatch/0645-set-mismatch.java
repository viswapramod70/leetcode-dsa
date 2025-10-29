class Solution {
    // public int[] findErrorNums(int[] nums) {
    //     //cyclic sort
    //     int i=0;
    //     while(i<nums.length){
    //         int correct_index=nums[i]-1;
    //         if(nums[i]!=nums[correct_index])
    //             swap(nums,i,correct_index);
    //         else
    //             i++;
    //     }
    //     for(int j=0;j<nums.length;j++){
    //         if(nums[j]!=(j+1))
    //             return new int[]{nums[j],(j+1)};
    //     }
    //     return new int[]{-1,-1};
    // }
    // public void swap(int arr[],int i,int j){
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }
    public  int[] findErrorNums(int[] a) {
        long n = a.length; // size of the array
        // Find Sn and S2n:
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate S and S2:
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += a[i];
            S2 += (long)a[i] * (long)a[i];
        }

        //S-Sn = X-Y:
        long val1 = S - SN;

        // S2-S2n = X^2-Y^2:
        long val2 = S2 - S2N;

        //Find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2 / val1;

        //Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:
        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[]{(int)x, (int)y};
    }
}