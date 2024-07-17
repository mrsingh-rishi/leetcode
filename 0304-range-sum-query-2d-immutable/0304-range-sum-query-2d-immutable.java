class NumMatrix {
    int [][] prefix;
    public NumMatrix(int[][] m) {
        prefix = new int[m.length + 5][m[0].length + 5];
        int n = m.length;
        int o = m[0].length;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= o; j++){
                prefix[i][j] = prefix[i-1][j] + prefix[i][j-1]
                                - prefix[i-1][j-1] + m[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;
        row2++;
        col1++;
        col2++;

        return prefix[row2][col2] - prefix[row2][col1 -1] - prefix[row1 - 1][col2] 
                    + prefix[row1-1][col1-1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */