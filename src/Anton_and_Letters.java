import java.util.Scanner;

public class Anton_and_Letters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String letters = input.nextLine();
        int[] unique = new int[1000];
        int letterSlot = 1;
        int totalDistinctLetter = 0;

        for(int i = 1; i<letters.length()-1; i++){
            if( i == letterSlot){
                letterSlot +=3;
                unique[letters.charAt(i)] = 1;
            }
        }

        for(int sum: unique){
            totalDistinctLetter += sum;
        }

        System.out.println(totalDistinctLetter);
    }
}
