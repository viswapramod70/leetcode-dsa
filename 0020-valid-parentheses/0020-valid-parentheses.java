class Solution {
//    static boolean isValid(String str){
//     HashMap<Character,Character> bracketsMap = new HashMap<>();
//     bracketsMap.put('(', ')');
//     bracketsMap.put('{', '}');
//     bracketsMap.put('[', ']');
//     List<Character> openingBrackets = Arrays.asList('(', '{', '[');
//     Stack<Character> stack = new Stack<>();
//     for(char bracket : str.toCharArray()){
//         if(openingBrackets.contains(bracket))
//             stack.push(bracket);
//         else if(stack.size() > 0 && bracket == bracketsMap.get(stack.peek()))
//             stack.pop();
//         else
//             return false;
//     }
//     return stack.isEmpty();
//     } 
    static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='['||ch=='{'||ch=='(')
                stack.push(ch);
            else{
                if(stack.isEmpty())
                    return false;
                char top = stack.pop();
                if((ch==']'&&top!='[')||(ch=='}'&&top!='{')||(ch==')'&&top!='('))
                    return false;
            }
        }
        return stack.isEmpty();
    }


}