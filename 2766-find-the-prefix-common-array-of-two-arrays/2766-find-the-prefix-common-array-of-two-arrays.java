class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[A.length];
        int n = A.length;
        int count = 0;
        if(A[0] == B[0])
            count++;
        ans[0] = count;
        map.put(A[0], map.getOrDefault(A[0], 0) + 1);
        map.put(B[0], map.getOrDefault(B[0], 0) + 1);
        for(int i = 1; i < n; i++){
            if(A[i] == B[i]){
                count++;
            }
            else{
                if(map.containsKey(A[i])) count++;
                if(map.containsKey(B[i])) count++;
            }
            
            ans[i] = count;
            
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            map.put(B[i], map.getOrDefault(B[i], 0) + 1);
        }
        return ans;
    }
}