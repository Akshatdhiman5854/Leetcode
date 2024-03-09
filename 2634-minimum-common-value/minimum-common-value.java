class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int x: nums1) {
            if(mp.containsKey(x)) {
                continue;
            }
            else {
                mp.put(x, 1);
            }
        }

        for(int x: nums2) {
            if(mp.containsKey(x)) {
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
            else {
                continue;
            }
        }
        int min = Integer.MAX_VALUE;


        Iterator<Integer> iterator = mp.values().iterator();
        while (iterator.hasNext()) {
            int x = iterator.next();
            if (x < 2) {
                iterator.remove();
            }
        }
        System.out.println(mp);
        if(mp.isEmpty()) {
            return -1;
        }
        // for(int x: mp.values()) {
        //     if(x != 2) {
        //         mp.remove(x);
        //     }
        // }


        for(Map.Entry<Integer, Integer> itr: mp.entrySet()) {
            int x = itr.getKey();
            min = min < x? min: x;
        }

        // for(int x: mp.key()) {
        //     min = min < x? min: x;
        // }

        return min;
    }
}