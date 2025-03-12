class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean arr[] = new boolean[nums.length];

        for(int i = 0; i < nums.length; i++) {
            arr[nums[i] - 1] = true;   
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(!arr[i]) {
                list.add(i+1);
            }
        }

        return list;
    }
}