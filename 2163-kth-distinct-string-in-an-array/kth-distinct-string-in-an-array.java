class Solution {
    public String kthDistinct(String[] str, int k) {
        if(str.length == 0) {
            return "";
        }
        Map<String, Integer> mp = new HashMap<>();
        List<String> l = new ArrayList<>();
        int temp = 0;

        for(String s : str) {
            mp.put(s, mp.getOrDefault(s, 0) + 1);
        }

        for(String s : str) {
            if(mp.get(s) == 1) {
                temp++;
                if(temp == k) {
                    return s;
                }
            }
        }


        return "";
    }
}