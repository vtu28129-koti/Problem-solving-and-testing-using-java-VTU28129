import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        while(temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if(num == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

OUTPUT:
Enter number: 65486
Not Palindrome
