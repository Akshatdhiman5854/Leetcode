class Solution {
public:
    bool threeConsecutiveOdds(vector<int>& arr) {
        int score = 0;
        int n = arr.size();
        for(int i = 0; i<n; i++) {
            if(arr[i] % 2 == 0) {
                score = 0;
            } else {
                score++;
            }

            if(score == 3) {
                return true;
            }
        }

        return false;
    }
};