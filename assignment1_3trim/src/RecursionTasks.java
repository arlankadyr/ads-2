import java.util.Scanner;
 public class RecursionTasks {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Problem 1: Find the minimum in an array
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(findMin(arr, n));

            // Problem 2: Find the average of an array
            n = scanner.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(findAverage(arr, n));

            // Problem 3: Check if a number is prime
            n = scanner.nextInt();
            System.out.println(isPrime(n, 2) ? "Prime" : "Composite");

            // Problem 4: Find factorial
            n = scanner.nextInt();
            System.out.println(factorial(n));

            // Problem 5: Find nth Fibonacci number
            n = scanner.nextInt();
            System.out.println(fibonacci(n));

            // Problem 6: Compute a^n
            int a = scanner.nextInt();
            int exp = scanner.nextInt();
            System.out.println(power(a, exp));

            // Problem 7: Reverse print an array using recursion
            n = scanner.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            reversePrint(arr, n - 1);
            System.out.println();

            // Problem 8: Check if a string contains only digits
            String s = scanner.next();
            System.out.println(isAllDigits(s) ? "Yes" : "No");

            // Problem 9: Compute binomial coefficient C(n, k)
            n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(binomialCoeff(n, k));

            // Problem 10: Compute GCD using Euclidean Algorithm
            a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(gcd(a, b));
        }

        public static int findMin(int[] arr, int n) {
            int min = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] < min) min = arr[i];
            }
            return min;
        }

        public static double findAverage(int[] arr, int n) {
            double sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum / n;
        }

        public static boolean isPrime(int n, int i) {
            if (n < 2) return false;
            if (i * i > n) return true;
            if (n % i == 0) return false;
            return isPrime(n, i + 1);
        }

        public static int factorial(int n) {
            return (n == 0) ? 1 : n * factorial(n - 1);
        }

        public static int fibonacci(int n) {
            if (n <= 1) return n;
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

        public static int power(int a, int n) {
            if (n == 0) return 1;
            return a * power(a, n - 1);
        }

        public static void reversePrint(int[] arr, int index) {
            if (index < 0) return;
            System.out.print(arr[index] + " ");
            reversePrint(arr, index - 1);
        }

        public static boolean isAllDigits(String s) {
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) return false;
            }
            return true;
        }

        public static int binomialCoeff(int n, int k) {
            if (k == 0 || k == n) return 1;
            return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
        }

        public static int gcd(int a, int b) {
            return (b == 0) ? a : gcd(b, a % b);
        }
    }

