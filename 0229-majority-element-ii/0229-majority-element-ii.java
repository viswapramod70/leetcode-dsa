class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0, count2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        for(int n:nums){
            if(count1==0 && ele2!=n){
                count1=1;
                ele1=n;
            }
            else if(count2==0 && ele1!=n){
                count2=1;
                ele2=n;
            }
            else if(ele1==n)
                count1++;
            else if(ele2==n)
                count2++;
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(ele1==nums[i])
                count1++;
            if(ele2==nums[i])
                count2++;
        }
        int min=(int)(nums.length/3)+1;
        if(count1>=min)
            ans.add(ele1);
        if(count2>=min)
            ans.add(ele2);
        return ans;
    }
}