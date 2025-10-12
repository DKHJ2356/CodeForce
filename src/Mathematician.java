import java.util.Scanner;

public class Mathematician {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Step 1 : Declare variable

        String firstDigit = input.next();
        String secondDigit = input.next();
        char[] calculation = new char[firstDigit.length()];

        //Step 2 : Execute XOR operation using array

        for (int i = 0; i < firstDigit.length(); i++) {
            if (firstDigit.charAt(i) == secondDigit.charAt(i)) calculation[i] = '0';
            else calculation[i] = '1';
        }

        String answer = String.valueOf(calculation);
        System.out.println(answer);
    }
}
