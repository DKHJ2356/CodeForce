import java.util.Scanner;

public class Anton_and_Letters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String letters = input.nextLine();
        int similar = 0;
        int total = 0;

        System.out.println(letters);

        for (int i = 1; i < letters.length() - 1; i += 3) {
            total+=1;
            for (int j = 4; j < letters.length() - 1; j += 3) {
                if (letters.charAt(i) == letters.charAt(j)){
                    similar = 1;
                }
            }
        }
    }
}
