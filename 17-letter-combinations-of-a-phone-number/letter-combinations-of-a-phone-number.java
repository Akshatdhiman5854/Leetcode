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

    public void backtrack(String combination, String next_digit, String[] phone_map, List<String> ans) {
        if(next_digit.length() == 0) {
            ans.add(combination);
        } 
        else {
            String letters = phone_map[next_digit.charAt(0) - '0'];
            for(char letter : letters.toCharArray()) {
                backtrack(combination + letter, next_digit.substring(1), phone_map, ans);
            }
        }
    }
}