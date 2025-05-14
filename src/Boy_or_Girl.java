import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String figure = sc.nextLine();
        figure = figure.toLowerCase();

        Set<Character> unique = new HashSet<>();


        for(int i = 0 ; i < figure.length() ; i++){
            unique.add(figure.charAt(i));
        }

        if(unique.size()%2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");

    }
}
