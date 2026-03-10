import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int flagHash = 0;
        int stop = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int k = i + 1;

                if (k % 2 != 0) {
                    System.out.print("#");
                    stop = 0;
                } else if (flagHash == 0 && k % 2 == 0) {

                    if (flagHash == 0 && j != m - 1) {
                        System.out.print(".");
                    } else{
                        System.out.print("#");
                        flagHash = 1;
                        stop = 1;
                    }

                }
                if (flagHash == 1 && k % 2 == 0 && stop == 0) {
                    if (j == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }


            }

            if (i != n - 1) System.out.println();
        }

    }
}
