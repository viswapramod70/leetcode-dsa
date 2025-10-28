class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0;
		int xor2=0;
		for(int i=0;i<=nums.length;i++) {
			xor1^=i;
		}
		for (int num : nums) {
			xor2^=num;
		}
		return xor1^xor2;
    }
    // public static int missingNumber(int[] arr) {
    //     //using cyclic sort
	// 	int i=0;
	// 	while(i<arr.length) {
	// 		int correct = arr[i];
	// 		if(arr[i]<arr.length && arr[i]!=arr[correct]){
	// 			swap(arr,i,correct);
    //         }
	// 		else{
    //             i++;
    //         }
	// 	}
	// 	// Search for 1st missing number
	// 	for(int index=0;index<arr.length;index++) {
	// 		if(arr[index]!=index)
	// 			return index;
	// 	}
	// 	// case 2
	// 	return arr.length;
    // }
    // public static void swap(int[] arr,int first,int second) {
	// 	int temp = arr[first];
	// 	arr[first] = arr[second];
	// 	arr[second] = temp;
	// }
}