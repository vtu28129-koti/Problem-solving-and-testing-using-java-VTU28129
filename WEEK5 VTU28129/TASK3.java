import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static List<Integer> maxSubarray(List<Integer> arr) {
        int maxSubarray = arr.get(0);
        int currentMax = arr.get(0);

        int maxElement = arr.get(0);
        int maxSubsequence = 0;
        boolean hasPositive = false;

        for (int num : arr) {
            maxElement = Math.max(maxElement, num);
            if (num > 0) {
                maxSubsequence += num;
                hasPositive = true;
            }
        }

        for (int i = 1; i < arr.size(); i++) {
            int num = arr.get(i);
            currentMax = Math.max(num, currentMax + num);
            maxSubarray = Math.max(maxSubarray, currentMax);
        }

        if (!hasPositive) {
            maxSubsequence = maxElement;
        }

        return Arrays.asList(maxSubarray, maxSubsequence);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> result = Result.maxSubarray(arr);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
OUTPUT:
Input (stdin)
2
4
1 2 3 4
6
2 -1 2 3 4 -5
Your Output (stdout)
10 10
10 1
