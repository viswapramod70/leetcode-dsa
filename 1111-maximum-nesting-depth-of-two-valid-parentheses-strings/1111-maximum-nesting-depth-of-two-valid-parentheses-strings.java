class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int x=0, i=0;
        int[] result = new int[seq.length()];
        for(char ch : seq.toCharArray()){
            if(ch == '('){
                result[i] = x%2;
                x++;
            }
            else{
                x--;
                result[i] = x%2;
            }
            i++;
        }
        return result;
    }
}