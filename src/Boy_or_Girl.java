import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String figure = sc.nextLine();
        figure = figure.toLowerCase();

        int count = 0,unique = figure.length();


        for(int i = 0 ; i < figure.length() ; i++){
            for(int j = i+1 ; j < figure.length() ; j++){
                if(figure.charAt(i) == figure.charAt(j)){
                    unique--;
                }
            }
        }

        if(unique%2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
