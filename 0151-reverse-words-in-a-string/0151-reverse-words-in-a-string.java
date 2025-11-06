class Solution {
   public static String reverseWords(String s) {
	    String[] ans = s.split(" ");
	    String out = "";
	    for (int i = ans.length - 1; i >= 0; i--) {
	        if (!out.equals("") && !ans[i].equals("")) {
	            out += " ";
	        }

	        out += ans[i].trim();
	       
	    }
	    return out.trim();
	}
}