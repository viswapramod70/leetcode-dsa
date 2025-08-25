class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int len=s.length();
        if(len%2==0)
        {
            int i;
            for(i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch=='('||ch=='{'||ch=='[')
                    st.push(ch);
                else if(!st.empty())
                {
                    if((ch==')'&&st.pop()!='(')||(ch=='}'&&st.pop()!='{')||(ch==']'&&st.pop()!='['))
                    {
                        break;
                    }
                }
                else
                {
                    break;
                }
            }
            if(st.empty()&&i==s.length())
                return true;
            else 
                return false;
        }
        else
            return false;
        
    }
}