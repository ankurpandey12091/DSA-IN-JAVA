public class patternnn {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Print spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // Print stars
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
1
            // Move to next row
            System.out.println();
        }
    }
}