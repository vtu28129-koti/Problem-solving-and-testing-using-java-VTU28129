import java.util.Scanner;

public class SumLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int last1 = Math.abs(a % 10);
        int last2 = Math.abs(b % 10);

        System.out.println("Sum of last digits = " + (last1 + last2));
    }
}

OUTPUT:
Enter first number: 654
Enter second number: 646
Sum of last digits = 10
