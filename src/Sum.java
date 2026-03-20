import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        if (testCases >= 1 && testCases <= 9261) {
            for (int i = 0; i < testCases; i++) {
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();

                if (a == (b + c) || b == (a + c) || c == (a + b)) System.out.println("YES");
                else System.out.println("NO");

            }
        }
    }
}
