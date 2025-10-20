class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int count=0;
        int longest = 1;
        if(n==0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int it:set){
            if(!set.contains(it-1)){
                count=1;
                int x=it;
                while(set.contains(x+1)){
                    count++;
                    x=x+1;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}