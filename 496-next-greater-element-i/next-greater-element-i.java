class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < nums2.length; i++) {
            int x = nums2[i];
            int val = -1;
            if((i+1) == nums2.length) {
                mp.put(x, -1);
            }
            else {
                int j = i;
                while((j+1) != nums2.length && nums2[j+1] < x) {
                    j++;
                }
                if(!(j+1 >= nums2.length)) {
                    val = nums2[j+1];
                }
                mp.put(x, val);
            }
        }

        for(int i = 0; i<nums1.length; i++) {
            if(mp.containsKey(nums1[i])) {
                arr[i] = mp.get(nums1[i]);
            }
        }

        return arr;
    }
}