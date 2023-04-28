// program of printing pyramid pattern in java

public class pyramid_pattern_02 {
    public static void pyramid_pattern(int n) {

        // outer loop;
        for (int i = 1; i <= n; i++) {

            // inner loop --- spaces;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }  

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print( "*");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        pyramid_pattern(4);
    }
}
