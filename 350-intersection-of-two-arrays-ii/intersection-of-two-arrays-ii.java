class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        while(i < n1 && j < n2) {
            if(nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]) {
                i++;
            }
            else if(nums1[i] > nums2[j]) {
                j++;
            }
        }
        System.out.println(list.size());
        int ans[] = new int[list.size()];
        for(int k=0; k<list.size(); k++) {
            ans[k] = list.get(k);
        }

        return ans;
    }
}