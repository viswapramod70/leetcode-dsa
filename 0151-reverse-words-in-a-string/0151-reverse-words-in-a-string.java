class Solution {
   public static String reverseWords(String s) {
	    String[] ans = s.split(" ");
	    int c = 0;
	    String out = "";
	    for (int i = ans.length - 1; i >= 0; i--) {
	        if (c != 0 && !ans[i].equals("")) {
	            out += " ";
	        }

	        out += ans[i].trim();
	        c++;
	    }
	    return out.trim();
	}
}