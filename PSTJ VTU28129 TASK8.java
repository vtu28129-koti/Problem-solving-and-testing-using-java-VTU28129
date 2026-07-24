import java.util.Scanner;
import java.util.function.Function;

public class FibonacciLambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        Function<Integer, Integer> fib = x -> {
            if(x == 0)
                return 0;
            if(x == 1)
                return 1;

            int a = 0, b = 1, c = 0;

            for(int i = 2; i <= x; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        };

        System.out.println("Fibonacci = " + fib.apply(n));
    }
}

OUTPUT:
Enter N: 654168
Fibonacci = -1824924640
