public class Pattern {

    public static void main(String[] args) {

        int n = 6;

        for (int row = 0; row <= n; row++) {

            for (int col = 0; col <= n; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}