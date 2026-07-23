import java.util.Scanner;

public class ArrayPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Pairs:");

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }
}

OUTPUT:
Enter size: 6
Enter elements:
5
15
14
18
19
17
Pairs:
(5, 15)
(5, 14)
(5, 18)
(5, 19)
(5, 17)
(15, 14)
(15, 18)
(15, 19)
(15, 17)
(14, 18)
(14, 19)
(14, 17)
(18, 19)
(18, 17)
(19, 17)
