import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;

        int [] petya = new int[n];
        int [] vasya = new int[n];
        int [] tonya = new int[n];

        for(int i = 0; i<n; i++){
            petya[i] = sc.nextInt();
            vasya[i] = sc.nextInt();
            tonya[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++) {

            if (petya[i] == 1 && vasya[i] == 1 && tonya[i] == 1) x++;
            else {
                if(petya[i] == 1 && vasya[i] == 1 ) x++;
                if(vasya[i] == 1 && tonya[i] == 1 ) x++;
                if(tonya[i] == 1 && petya[i] == 1 ) x++;
            }
        }
        System.out.println(x);

    }
}
