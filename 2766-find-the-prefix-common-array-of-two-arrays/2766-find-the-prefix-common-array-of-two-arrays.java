class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int c []= new int[A.length];
        Map<Integer, Integer> m = new HashMap<>();
        int count = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == B[i]){
                count++; 
            }
            else{

            if(m.containsKey(B[i])) count++;
            if(m.containsKey(A[i])) count++;
            }

            c[i] = count;

            m.put(A[i], m.getOrDefault(A[i], 0) + 1);
            m.put(B[i], m.getOrDefault(B[i], 0) + 1);
        }

        return c;
    }
}