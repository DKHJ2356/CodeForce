import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Step 1: Declare variables

        final int ALPHABET_SIZE = 26;
        int[] flag = new int[ALPHABET_SIZE];
        int stringLength = input.nextInt();
        String word = input.next();
        int total = 0;

        // Lower case everything for simplification

        word = word.toLowerCase();


        // Separate words into letters and confirm distinct letter

        for(int i = 0; i < stringLength; i++){
            int indexOfAlphabet = word.charAt(i) - 97;
            flag[indexOfAlphabet] = 1;
        }

        //confirm pangram or not

        for(int i: flag){
            total += i;
        }

        if(total == 26) System.out.println("YES");
        else System.out.println("NO");
    }
}
