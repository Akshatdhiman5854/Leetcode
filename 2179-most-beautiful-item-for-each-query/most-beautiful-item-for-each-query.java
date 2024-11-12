class Solution {
public int[] maximumBeauty(int[][] items, int[] queries) {
    // Sort the items based on price
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
        
        int n = items.length;
        int[] maxBeauty = new int[n];
        int[] prices = new int[n];
        
        // Fill maxBeauty with the maximum beauty seen so far and prices with item prices
        maxBeauty[0] = items[0][1];
        prices[0] = items[0][0];
        
        for (int i = 1; i < n; i++) {
            prices[i] = items[i][0];
            maxBeauty[i] = Math.max(maxBeauty[i - 1], items[i][1]);
        }
        
        // Array to store the results for the queries
        int m = queries.length;
        int[] answer = new int[m];
        
        // For each query, find the maximum beauty with price <= query using binary search
        for (int i = 0; i < m; i++) {
            int idx = binarySearch(prices, queries[i]);
            if (idx == -1) {
                answer[i] = 0;  // No item has price <= queries[i]
            } else {
                answer[i] = maxBeauty[idx];  // Maximum beauty up to price queries[i]
            }
        }
        
        return answer;
    }

    // Binary search to find the largest price <= target
    private int binarySearch(int[] prices, int target) {
        int low = 0, high = prices.length - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (prices[mid] <= target) {
                result = mid;  // Save the index of this valid price
                low = mid + 1;  // Try to find a larger price within the limit
            } else {
                high = mid - 1;
            }
        }
        
        return result;
}
}