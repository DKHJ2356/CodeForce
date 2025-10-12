import java.util.Scanner;

public class Horseshoe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Step 1 : Declare variables

        final int MAX_HORSESHOE_NUMBER = 4;
        int n = 0;
        int[] i = new int[MAX_HORSESHOE_NUMBER];
        int matches = 0;
        int flag = 0;

        //Step 2 : Input values for integers

        while (n < MAX_HORSESHOE_NUMBER) {
            i[n] = input.nextInt();
            n++;
        }

        //Step 3 : Calculate the similar color of horseshoes

        for (int j = 0; j < MAX_HORSESHOE_NUMBER; j++) {
            for (int k = j + 1; k < MAX_HORSESHOE_NUMBER; k++) {
                if (i[j] == i[k] && flag == 0){
                    flag = 1;
                    matches++;
                }
            }
            flag = 0;
        }

        System.out.println(matches);
    }
}
