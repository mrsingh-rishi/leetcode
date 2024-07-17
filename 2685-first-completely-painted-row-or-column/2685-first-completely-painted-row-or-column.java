class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer, Cell> map = new HashMap<>();

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                map.put(mat[i][j], new Cell(i, j));
            }
        }

        int row[] = new int[mat.length];
        int col[] = new int[mat[0].length];

        Arrays.fill(row, mat[0].length);
        Arrays.fill(col, mat.length);

        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            Cell c = map.get(num);
            row[c.i]--;
            if(row[c.i] <= 0)
                return i;
            col[c.j]--;
            if(col[c.j] <= 0)
                return i;
        }
        return arr.length - 1;
    }

    class Cell{
        int i, j;

        Cell(int a, int b){
            this.i = a;
            this.j = b;
        }
    }
}