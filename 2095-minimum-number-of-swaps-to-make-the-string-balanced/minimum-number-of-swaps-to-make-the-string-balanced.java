// Approach - 01 [ Stack ]
class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();

        for (char val : s.toCharArray()) { // for(int i=0; i<s.length(); i++)
            if (stack.isEmpty()) {
                stack.push(val); // val = s.charAt(i)
            } 
            else if (stack.peek() == '[' && val == ']') {
                stack.pop();
            } 
            else {
                stack.push(val); // val = s.charAt(i)
            }
        }

        // when you have single pair
        if (stack.size() == 2) {
            return 1;
        }

        // stack does have both girl and boy count
        // half of them would be the total swap amount
        int single = stack.size() / 2;

        // a. Math.ceil is used to handle odd case
        // b. for two-pair we need to do one swap
        //    so, total swap = single / 2
        return (int)Math.ceil((double)single / 2);
    }
}