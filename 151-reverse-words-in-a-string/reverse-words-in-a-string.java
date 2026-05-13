class Solution {
    
    public String reverseWords(String s) {
        
        // Remove leading/trailing spaces and split by multiple spaces
        String[] words = s.trim().split("\\s+");
        
        StringBuilder result = new StringBuilder();
        
        // Traverse from end to beginning
        for (int i = words.length - 1; i >= 0; i--) {
            
            result.append(words[i]);
            
            if (i != 0) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}