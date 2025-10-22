import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Step 1: Declare Variables

        int nSquad = input.nextInt();
        int[] Ath = new int[nSquad];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minIndex = 0, maxIndex = 0;

        //Step 2: Input values and find min and max

        for (int i = 0; i < nSquad; i++) {
            Ath[i] = input.nextInt();

            if (Ath[i] > max) {
                max = Ath[i];
                maxIndex = i;
            }

            if (Ath[i] <= min) {
                min = Ath[i];
                minIndex = i;
            }
        }

        //Step 3: Calculate total swaps and use some formula

        int total = maxIndex + (nSquad - 1 - minIndex);
        if (maxIndex > minIndex) total--;

        //Step 4: Display values

        System.out.println(total);

    }
}

