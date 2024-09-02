class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int student : chalk) {
            sum += student;
        }

        int remain = (int)(k % sum);

        for(int i = 0; i < chalk.length; i++) {
            if(remain < chalk[i]) {
                return i;
            }
            remain -= chalk[i];
        }

        return 0;
    }
}