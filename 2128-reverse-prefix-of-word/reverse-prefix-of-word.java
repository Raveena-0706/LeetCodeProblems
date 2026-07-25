class Solution {

    public String reversePrefix(String word, char ch) {

        int index = word.indexOf(ch);

        if (index == -1)
            return word;

        String prefix = new StringBuilder(word.substring(0, index + 1))
                .reverse()
                .toString();

        return prefix + word.substring(index + 1);
    }
}