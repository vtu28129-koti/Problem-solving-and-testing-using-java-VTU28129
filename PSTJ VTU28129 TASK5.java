import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        Arrays.sort(arr);

        if(k > 0 && k <= n)
            System.out.println("Kth Smallest = " + arr[k - 1]);
        else
            System.out.println("Invalid K");
    }
}

OUTPUT:
Enter size: 3
Enter elements:
55
89
16
Enter K: 1
Kth Smallest = 16
