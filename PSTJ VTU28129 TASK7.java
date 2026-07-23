import java.util.Scanner;
import java.util.function.BiFunction;

public class DigitSumLambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter choice (even/odd): ");
        String choice = sc.next();

        BiFunction<Integer, String, Integer> sumDigits = (n, type) -> {
            int sum = 0;
            while(n > 0) {
                int digit = n % 10;

                if(type.equalsIgnoreCase("even") && digit % 2 == 0)
                    sum += digit;

                if(type.equalsIgnoreCase("odd") && digit % 2 != 0)
                    sum += digit;

                n /= 10;
            }
            return sum;
        };

        System.out.println("Sum = " + sumDigits.apply(num, choice));
    }
}

OUTPUT:
Enter number: 684656518
Enter choice (even/odd): even
Sum = 38
