import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int flagHash = 0;
        int last = 2;
        int first = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int k = i + 1;

                if (k % 2 != 0) {
                    System.out.print("#");
                } else {

                    if (flagHash == 0 && k == last && j != m - 1) {
                        System.out.print(".");
                    } else if (flagHash == 0 && k == last && j == m - 1) {
                        System.out.print("#");
                        flagHash = 1;
                        last += 4;  /// line 2 or index 1 for i is k = last so first does not get close
                    }

                    if (flagHash == 1 && k == first && j == 0) {
                        System.out.print("#");
                    } else if (flagHash == 1 && k == first && j != 0){
                        System.out.print(".");
                    }
                    if(flagHash == 1 && k == first && j == m-1){
                        flagHash = 0;
                        first += 4;
                    }

                }


            }

            if (i != n - 1) System.out.println();
        }

    }
}
