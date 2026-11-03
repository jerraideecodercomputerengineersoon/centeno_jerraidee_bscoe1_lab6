import java.util.Scanner;

/**
 *
 * @author LENOVO LOQ
 */
 
public class Lab6problem {

    // Task 1: Greeting
    static void greetUser() {
        System.out.println("Hello, welcome to the Math Program!");
    }

    // Task 2
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    // Task 3
    static int factorial(int n) {
        int answer = 1;

        for (int i = 1; i <= n; i++) {
            answer = answer * i;
        }

        return answer;
    }

    // Task 4
    static int sumArray(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum;
    }

    // Task 5
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Task 6
    static int maxInArray(int[] numbers) {
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    // Task 7
    static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    // Task 7: LCM
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    // Challenge 1: Recursive Factorial
    static int recursiveFactorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * recursiveFactorial(n - 1);
    }

    // Challenge 2: Fibonacci
    static int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    // Challenge 3: Palindrome
    static boolean isPalindrome(String word) {
        word = word.toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        greetUser();

        // Arithmetic
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));

        if (b != 0) {
            System.out.println("Division: " + divide(a, b));
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Factorial
        System.out.print("Enter a number for factorial: ");
        int n = input.nextInt();

        if (n >= 0 && n <= 12) {
            System.out.println("Factorial: " + factorial(n));
            System.out.println("Recursive factorial: "
                    + recursiveFactorial(n));
        } else {
            System.out.println("Enter a number from 0 to 12.");
        }

        // Array
        int[] numbers = {10, 20, 15, 12, 18};

        System.out.println("Sum of array elements: "
                + sumArray(numbers));

        System.out.println("Largest number: "
                + maxInArray(numbers));

        // Prime number
        System.out.print("Enter a number to check prime: ");
        int prime = input.nextInt();

        if (isPrime(prime)) {
            System.out.println(prime + " is prime.");
        } else {
            System.out.println(prime + " is not prime.");
        }

        // GCD and LCM
        System.out.print("Enter two positive numbers for GCD and LCM: ");
        int x = input.nextInt();
        int y = input.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("GCD: " + gcd(x, y));
            System.out.println("LCM: " + lcm(x, y));
        } else {
            System.out.println("Please enter positive numbers.");
        }

        // Fibonacci
        System.out.print("Enter Fibonacci position (0-10): ");
        int position = input.nextInt();

        if (position >= 0 && position <= 10) {
            System.out.println("Fibonacci: " + fib(position));
        } else {
            System.out.println("Enter a number from 0 to 10.");
        }

        // Palindrome
        input.nextLine();

        System.out.print("Enter a word to check palindrome: ");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        input.close();
    }
}
