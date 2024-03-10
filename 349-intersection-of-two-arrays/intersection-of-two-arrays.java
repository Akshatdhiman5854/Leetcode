class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int x: nums1) {
            mp.put(x, mp.getOrDefault(x, 0)+1);
        }

        for(int x: nums2) {
            if(mp.containsKey(x)) {
                list.add(x);
                mp.remove(x);
            }
        }

        int n = list.size();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}