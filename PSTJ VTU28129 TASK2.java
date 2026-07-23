import java.util.Scanner;

public class AccessElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if(index >= 0 && index < n)
            System.out.println("Element = " + arr[index]);
        else
            System.out.println("Invalid Index");
    }
}

OUTPUT:
Enter size of array: 5
Enter array elements:
12
13
16
15
14
Enter index: 4
Element = 14
