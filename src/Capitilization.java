import java.util.Scanner;

public class Capitilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        for(int i = 0; i < word.length(); i++){
            char [] temp = word.toCharArray();

            temp[0] = word.toUpperCase().charAt(0);

            word = new String(temp);
        }

        System.out.println(word);
    }
}
