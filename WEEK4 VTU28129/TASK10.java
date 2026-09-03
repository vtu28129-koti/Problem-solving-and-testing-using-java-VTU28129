import java.util.*;

public class Main {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {

        int m = matrix.size();
        int n = matrix.get(0).size();

        int[][] arr = new int[m][n];

        // Convert List<List<Integer>> to 2D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = matrix.get(i).get(j);
            }
        }

        // Number of layers
        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = m - 1 - layer;
            int right = n - 1 - layer;

            // Top row: left -> right
            for (int j = left; j <= right; j++) {
                elements.add(arr[top][j]);
            }

            // Right column: top+1 -> bottom
            for (int i = top + 1; i <= bottom; i++) {
                elements.add(arr[i][right]);
            }

            // Bottom row: right-1 -> left
            for (int j = right - 1; j >= left; j--) {
                elements.add(arr[bottom][j]);
            }

            // Left column: bottom-1 -> top+1
            for (int i = bottom - 1; i > top; i--) {
                elements.add(arr[i][left]);
            }

            // Rotate anti-clockwise
            int len = elements.size();
            int shift = r % len;

            List<Integer> rotated = new ArrayList<>();

            for (int i = shift; i < len; i++) {
                rotated.add(elements.get(i));
            }

            for (int i = 0; i < shift; i++) {
                rotated.add(elements.get(i));
            }

            // Put rotated elements back
            int index = 0;

            // Top row
            for (int j = left; j <= right; j++) {
                arr[top][j] = rotated.get(index++);
            }

            // Right column
            for (int i = top + 1; i <= bottom; i++) {
                arr[i][right] = rotated.get(index++);
            }

            // Bottom row
            for (int j = right - 1; j >= left; j--) {
                arr[bottom][j] = rotated.get(index++);
            }

            // Left column
            for (int i = bottom - 1; i > top; i--) {
                arr[i][left] = rotated.get(index++);
            }
        }

        // Print result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);

                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }

            matrix.add(row);
        }

        matrixRotation(matrix, r);

        sc.close();
    }
}

OUTPUT:
Input (stdin)
4 4 1
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Expected Output
2 3 4 8
1 7 11 12
5 6 10 16
9 13 14 15
