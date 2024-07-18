class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(sum % k == 0 && i+1 >= 2){
                return true;
            }
            else if(map.containsKey(sum % k)){
                int size = i - map.get(sum % k);

                if(size >= 2)   return true; 
            }
            else map.put(sum % k, i);
        }

        return false;
    }
}