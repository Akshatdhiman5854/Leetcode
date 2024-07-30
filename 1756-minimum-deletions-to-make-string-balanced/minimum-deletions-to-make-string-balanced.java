class Solution {
    public int minimumDeletions(String str) {
        Stack<Character> s = new Stack<>();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (!s.isEmpty() && s.peek() == 'b') {
                if (c == 'a') {
                    s.pop();
                    count++;
                }
                else s.push(c);
            }
            else s.push(c);
        }

        return count;
    }
}