import java.util.Scanner;

class Fibo{
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int fib = 0;
            for (int i = 2; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            return fib;
        }
    }
}

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o da série de Fibonacci (n): ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("O número deve ser não negativo.");
        } else {
            System.out.print("Série de Fibonacci até" + n + ": ");
            for (int i = 0; i <= n; i++) {
                System.out.print(Fibo.fibonacci(i));
                if (i < n) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}


