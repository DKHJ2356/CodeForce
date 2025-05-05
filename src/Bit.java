import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;

        for(int i = 1 ; i<=n ; i++){
            String word = sc.next();
            if(word.charAt(0) == '+' || word.charAt(word.length()-1) == '+'){
                x++;
            }
            else if(word.charAt(0) == '-' || word.charAt(word.length()-1) == '-'){
                x--;
            }
        }
        System.out.println(x);
    }
}
