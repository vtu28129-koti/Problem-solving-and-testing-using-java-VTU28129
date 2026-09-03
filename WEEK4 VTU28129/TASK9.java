class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] answer = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int sum = 0;

                // Find valid row range
                int rStart = Math.max(0, i - k);
                int rEnd = Math.min(m - 1, i + k);

                // Find valid column range
                int cStart = Math.max(0, j - k);
                int cEnd = Math.min(n - 1, j + k);

                // Calculate block sum
                for (int r = rStart; r <= rEnd; r++) {
                    for (int c = cStart; c <= cEnd; c++) {
                        sum += mat[r][c];
                    }
                }

                answer[i][j] = sum;
            }
        }

        return answer;
    }
}

OUTPUT:
Input
mat =
[[1,2,3],[4,5,6],[7,8,9]]
k =
1
