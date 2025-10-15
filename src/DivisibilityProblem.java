import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while (t-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int remainder = a % b;
            int moves = (b - remainder) % b;
            System.out.println(moves);
        }
    }
}
