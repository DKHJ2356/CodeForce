import java.util.Scanner;

public class yes_Or_Yes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        input.nextLine();

        for (int i = 0; i < testCases; i++) {
            String s = input.nextLine();

            if (s.equalsIgnoreCase("YES")) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
