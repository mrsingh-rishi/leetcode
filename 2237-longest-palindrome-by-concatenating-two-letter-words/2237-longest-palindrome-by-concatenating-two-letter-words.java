class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();

        for(String st: words){
            map.put(st, map.getOrDefault(st, 0) + 1);
        }

        boolean flag = false;

        int ans = 0;
        for(String st: map.keySet()){
            String rev ="" + st.charAt(1) + st.charAt(0);

            if(map.containsKey(rev)){
                if(rev.charAt(0) == rev.charAt(1)){
                    int freq = map.get(rev);

                    if(freq % 2 == 0){
                        ans += (freq * 2);
                    }
                    else{
                        if(!flag){
                            ans += freq * 2;
                            flag = true;
                        }
                        else{
                            ans += (freq - 1) * 2; 
                        }
                    }
                }
                else{
                    ans += Math.min(map.get(st), map.get(rev)) * 2;
                }
            }
        }


        return ans;
    }
}