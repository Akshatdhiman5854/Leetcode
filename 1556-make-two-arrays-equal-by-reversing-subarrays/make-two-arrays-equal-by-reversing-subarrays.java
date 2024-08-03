class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int x[] = new int[1001];
        int n = target.length;

        for(int i = 0; i < n; i++) {
            x[target[i]]++;
            x[arr[i]]--;
        }

        for(int i : x) {
            if(i != 0)
                return false;
        }

        return true;
    }

}