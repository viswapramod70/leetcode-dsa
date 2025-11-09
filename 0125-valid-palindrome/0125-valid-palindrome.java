class Solution {
    public boolean isPalindrome(String s) 
    {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>=65 && s.charAt(i)<=90)||(s.charAt(i)>=97 &&s.charAt(i)<=122)||(s.charAt(i)>='0' && s.charAt(i)<='9'))
            {
                res=s.charAt(i)+res;
            }
        }
        String s1="";
        for(int i=0;i<res.length();i++)
        {
           s1=res.charAt(i)+s1;
        }
        String r=res.toLowerCase();

        if(r.equals(s1.toLowerCase()))
        {
            return true;
        }
        return false;
        
    }
}