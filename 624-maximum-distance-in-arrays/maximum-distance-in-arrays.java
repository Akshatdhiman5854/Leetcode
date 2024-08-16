class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;
        
        for (int i = 1; i < arrays.size(); i++) {
            int currMin = arrays.get(i).get(0);
            int currMax = arrays.get(i).get(arrays.get(i).size() - 1);
            
            // Calculate the distance between the current array's max and the global min
            maxDistance = Math.max(maxDistance, Math.abs(currMax - minVal));
            
            // Calculate the distance between the current array's min and the global max
            maxDistance = Math.max(maxDistance, Math.abs(maxVal - currMin));
            
            // Update global min and max
            minVal = Math.min(minVal, currMin);
            maxVal = Math.max(maxVal, currMax);
        }
        
        return maxDistance;
    }
}