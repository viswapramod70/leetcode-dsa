class Solution {
    public int smallestNumber(int n) {
        
        String bin="";
        while(n>0){
            bin = (n%2)+bin;
            n/=2;
        }
        String ans="";
        for(int i=0;i<bin.length();i++){
            ans+=1;
        }
        int out =0;
        for(int i=0;i<ans.length();i++){
            out+=Math.pow(2,i);
        }
        return out;

    }
}