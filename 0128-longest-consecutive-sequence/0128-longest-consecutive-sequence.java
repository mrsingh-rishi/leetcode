class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int max = 0;
        for(int num: nums){
            int prev = num- 1;
        
            if(set.contains(prev)){
                continue;
            }

            else{
                int start = num;
                int len = 0;
                while(set.contains(start)){
                    start++;
                    len++;
                }

                max = Math.max(max, len);
            }
        }

        return max;
    }
}