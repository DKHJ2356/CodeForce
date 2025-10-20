import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Step 1: Declare Variables

        int nSquad = input.nextInt();
        int[] Ath = new int[nSquad];
        int min, max, minIndex = 0, maxIndex = 0;
        int total = 0;
        int flag = 0;
        int mid;

        //Step 2: Find mid

        if (nSquad % 2 != 0) mid = (nSquad - 1) / 2;
        else mid = nSquad / 2;

        //Step 3: Input values

        for (int i = 0; i < nSquad; i++) {
            Ath[i] = input.nextInt();
        }

        //Step 4: Find the minimum value and it's index

        min = Ath[0];

        for (int i = 0; i < nSquad; i++) {
            if (Ath[i] <= min) {
                min = Ath[i];
                minIndex = i;
            }
        }

        //Step 5: Make the latest min index to move to the last index

        if (minIndex >= mid) flag = 1;

        if (flag == 0) {
            for (int i = 0; i < nSquad; i++) {

                if (i == minIndex && i + 1 < nSquad) {
                    int temp = Ath[i];
                    Ath[i] = Ath[i + 1];
                    Ath[i + 1] = temp;
                    minIndex++;
                    total++;

                }
            }
        } else {
            for (int i = nSquad - 1; i >= 0; i++) {
                if (i == minIndex && i - 1 >= 0) {
                    int temp = Ath[i];
                    Ath[i] = Ath[i - 1];
                    Ath[i - 1] = temp;
                    minIndex--;
                    total++;
                }
            }
        }


        //Step 6: Find the maximum value and it's index

        max = Ath[nSquad - 1];

        for (int i = 0; i < nSquad; i++) {
            if (Ath[i] >= max) {
                max = Ath[i];
                maxIndex = i;
            }
        }

        //Step 7: Swap the maxIndex to the first Index

        if (maxIndex <= mid) flag = 1;

        if (flag == 0) {
            for (int i = nSquad - 1; i >= 0; i--) {
                if (i == maxIndex && i - 1 >= 0) {
                    int temp = Ath[i];
                    Ath[i] = Ath[i - 1];
                    Ath[i - 1] = temp;
                    maxIndex--;
                    total++;
                }
            }
        }else{
            for (int i = 0; i < nSquad; i++) {
                if (i == minIndex && i + 1 < nSquad) {
                    int temp = Ath[i];
                    Ath[i] = Ath[i + 1];
                    Ath[i + 1] = temp;
                    minIndex++;
                    total++;
                }
            }
        }

        System.out.println(max + " " + maxIndex);
        System.out.println(min + " " + minIndex);
        System.out.println(total);
        for (int arr : Ath) {
            System.out.printf("%d ", arr);
        }

    }
}

