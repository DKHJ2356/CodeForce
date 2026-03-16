import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        /// a is greater than b

        for (int i = 0; i < testCases; i++) {
            int n = input.nextInt();

            System.out.println((n - 1) / 2);

        }
    }
}
