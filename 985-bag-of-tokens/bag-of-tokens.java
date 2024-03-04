class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length == 1) {
            if(tokens[0] <= power) {
                return 1;
            }
            else {
                return 0;
            }
        }
        
        Arrays.sort(tokens);
        int n = tokens.length;
        int score = 0;
        int i = 0, j = n - 1;
        int ans = 0;

        while (i <= j) {
            if(power >= tokens[i]) {
                power -= tokens[i];
                i++;
                score++;
                ans = ans>score? ans: score;
            }
            else if(score >= 1) {
                power += tokens[j];
                j--;
                score--;                
            }
            else {
                break;
            }
        }

        return ans;
    }
}