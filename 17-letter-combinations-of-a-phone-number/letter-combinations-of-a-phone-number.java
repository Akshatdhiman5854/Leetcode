class Solution {
    
    public List<String> letterCombinations(String digits) {
    
        if(digits.length() == 0) {
            return new ArrayList<>();
        }

        List<String> ans = new ArrayList<>();    
        String str[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        backtrack("", digits, str, ans);
        return ans;

    }

    public void backtrack(String s, String digit, String[] str, List<String> ans) {
        if(digit.length() == 0) {
            ans.add(s);
        }
        else {
            String letters = str[digit.charAt(0) - '0'];
            for(char letter : letters.toCharArray()) {
                backtrack(s + letter, digit.substring(1), str, ans);
            }
        }
    }
}