import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();

        if( w>= 1 && w<= 100 ){
            if(w%2 == 0){
                if( w/2 == 1) System.out.println("No");
                else System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}