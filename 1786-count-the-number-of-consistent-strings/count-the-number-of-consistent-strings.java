class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        
        for(char ch : allowed.toCharArray()) {
            set.add(ch);
        }

        int count = 0;
        for(String str : words) {
            int flag = 0;

            for(char ch : str.toCharArray()) {
                if(!set.contains(ch)) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                count++;
            }
        }

        return count;
    }
}