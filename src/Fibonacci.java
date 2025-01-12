public class Fibonacci {

    /**
     * Will return the nth term in the Fibonacci sequence.
     * @param n The position of the term in the Fibonacci sequence.
     * @return The nth term in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibonacci(n));
    }
}
