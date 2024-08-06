class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        int arr[] = new int[26];

        for(char ch : word.toCharArray()) {
            arr[ch - 'a']++;
        }

        Arrays.sort(arr);

        int count = 0;
        int i = 25;
        int start = 1;

        while(i >= 0 && arr[i] != 0) {
            ans += (start * arr[i]);
            count++;

            if(count == 8) {
                start++;
                count = 0;
            }
            i--;
        }

        return ans;
    }
}