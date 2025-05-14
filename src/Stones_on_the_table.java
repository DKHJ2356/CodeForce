import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Stones_on_the_table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(),count = 0;

        String stones = sc.next();

        for(int i =0 ; i<n-1; i++){
                if( stones.charAt(i) == stones.charAt(i+1) ) count++;
        }

        System.out.println(count);

    }
}
