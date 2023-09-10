public class SystemErrExample {
    public static void main(String[] args) {
        try {
            // Attempt some operation that might cause an error
            int result = divide(10, 0);

            // In the main method, we call divide(10, 0) which will trigger an exception because we're attempting to divide by zero.

            // This line won't be executed if an exception occurs
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception and print an error message to System.err
            System.err.println("An error occurred: " + e.getMessage());
        }

        // We catch the ArithmeticException using a try-catch block and then use System.err.println() to print an error message to the standard error stream (System.err). This is often used for error messages or debugging information because it's displayed in the console as error output, separate from regular standard output (System.out).

    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");

            // We have a method divide() that attempts to perform a division operation. If the divisor is zero, it throws an ArithmeticException with a custom error message.
        }
        return dividend / divisor;
    }
}


// When you run this code, you'll see that the error message is displayed in red (in many console environments) to indicate that it's coming from the standard error stream.