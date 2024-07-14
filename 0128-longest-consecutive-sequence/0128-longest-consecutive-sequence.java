class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int maxLen = 0;
        for(int num: nums){
            int prev = num -1;
           
            if(set.contains(prev)){
                continue;
            }
            int start = num+1;
             int len = 1;
            while(set.contains(start)){
                len++;
                start++;
            }

            maxLen = Math.max(len, maxLen);
        }

        return maxLen;
    }
}