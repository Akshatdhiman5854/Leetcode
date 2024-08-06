class Solution {
    
    List<String> ans = new ArrayList<>();    
    String str[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            return new ArrayList<>();
        }

        backtrack("", digits);
        return ans;

    }

    public void backtrack(String s, String digit) {
        if(digit.length() == 0) {
            ans.add(s);
        }
        else {
            String letters = str[digit.charAt(0) - '0'];
            for(char letter : letters.toCharArray()) {
                backtrack(s + letter, digit.substring(1));
            }
        }
    }
}