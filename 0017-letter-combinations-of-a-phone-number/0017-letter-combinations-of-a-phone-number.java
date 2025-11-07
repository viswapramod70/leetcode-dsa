class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>();
        return helper("",digits);
    }
    public List<String> helper(String p,String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        Map<String,String> map = Map.of("2","abc","3","def","4","ghi","5","jkl",
        "6","mno","7","pqrs","8","tuv","9","wxyz");
        List<String> list = new ArrayList<>();
        char ch = up.charAt(0);
        String letters = map.get(String.valueOf(ch));
        for(int i=0;i<letters.length();i++){
            String s = String.valueOf(letters.charAt(i));
            list.addAll(helper(p+s,up.substring(1)));
        }
        return list;
    }
}