package pattern;

public class PascalStarTriangle {
    public static int factorial(int a)
    {
        // Edge case
        // Factorial of 0 is unity
        if (a == 0)

            // Hence return 1
            return 1;

        // else recursively call the function over the
        // number whose factorial is to be computed
        return a * factorial(a - 1);
    }

    // Method 2
    // Main driver method
    public static void main(String[] args) {
        // Declare and initialize number whose
        // factorial is to be computed
        int k = 5;

        int a, b;

        // Creating an object of GFG class
        // in the main() method


        // iterating using nested for loop to traverse over
        // matrix

        // Outer for loop
        for (a = 0; a <=k; a++) {

            // Inner loop 1
            for (b = 0; b <= k - a; b++) {

                // Print white space for left spacing
                System.out.print(" ");
            }

            // Inner loop 2
            for (b = 0; b <= a; b++) {

                // nCr formula
                System.out.print(
                        " "
                                + factorial(a)
                                / (factorial(a - b)
                                * factorial(b)));
            }

            // By now, we are done with one row so
            // a new line
            System.out.println();
        }
    }
}
