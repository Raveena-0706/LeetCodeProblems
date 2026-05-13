class Solution {
    
    public String makeFancyString(String s) {
        
        StringBuilder result = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            
            int len = result.length();
            
            // If last two chars are same as current, skip it
            if (len >= 2 &&
                result.charAt(len - 1) == ch &&
                result.charAt(len - 2) == ch) {
                continue;
            }
            
            result.append(ch);
        }
        
        return result.toString();
    }
}