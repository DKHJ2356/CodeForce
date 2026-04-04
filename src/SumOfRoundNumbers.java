import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();
        int remainder = 10;


        for (int i = 0; i < testCases; i++) {

            int round = 0;
            int n = input.nextInt();

            while (remainder <= 10000 && n != 0) {
                if (n > 0 && n < 10) round++;
                n/=10;
                remainder *= 10;
            }


            System.out.println(round);

        }


    }
}