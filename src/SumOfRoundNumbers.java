import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        int round = 0;

        for (int i = 0; i < testCases; i++) {
            int n = input.nextInt();
            int divisor = 10;
            String integer = String.valueOf(n);
            int integerLength = integer.length();

            while(integerLength != 0){
                divisor *= divisor;
                integerLength -= 2;
            }

            int lastDigit = n % 10;
            int secondDigit = n % divisor;

            System.out.println(secondDigit);
        }
    }
}