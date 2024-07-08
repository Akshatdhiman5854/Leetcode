class Solution {
    public int findTheWinner(int n, int k) {
        // List<Integer> list = new ArrayList<>();

        // for(int i = 0; i < n; i++) {
        //     list.add(i);
        // }
        // int pos = 0;
        // while(n > 1) {
        //     pos = (pos + k - 1) % n;
        //     list.remove(pos);
        //     n--;
        // }

        // return list.get(0) + 1;

        int winner = 0;

        for(int i = 1; i <= n; i++) {
            winner = (winner + k) % i;
        }

        return winner + 1;
    }
}