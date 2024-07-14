class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

        // Populate the map with numbers and their indices
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.putIfAbsent(num, new HashSet<>());
            map.get(num).add(i);
        }

        int ans = 0;
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int v1 = num + k;
            int v2 = num - k;
            // Check for pairs with value v1
            if (map.containsKey(v1)) {
                for (int key : map.get(v1)) {
                    if (key > i) {
                        ans++;
                    }
                }
            }
            // Check for pairs with value v2
            if (map.containsKey(v2)) {
                for (int key : map.get(v2)) {
                    if (key > i) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}
