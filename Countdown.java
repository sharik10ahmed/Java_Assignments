public class Countdown {
    // Recursive method to print numbers descending
    public static void printCountdown(int n) {
        // Base case: stop when n hits 0
        if (n <= 0) {
            return;
        }

        System.out.println(n);

        // Recursive call with a smaller sub-problem
        printCountdown(n - 1);
    }

    public static void main(String[] args) {
        // Starts the recursion from 5
        printCountdown(5);
    }
}
