import java.util.Scanner;

public class Petya_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String second = sc.next();

        first = first.toLowerCase();
        second = second.toLowerCase();

        int flag =0;

        for(int i = 0 ; i<first.length(); i++){
            if(first.charAt(i) != second.charAt(i)){
                if(first.charAt(i)>second.charAt(i)){
                    System.out.println(1);
                    flag = 1;
                    break;
                }
                else{
                    System.out.println(-1);
                    flag = 1;
                    break;
                }
            }
        }

        if(flag == 0) System.out.println(0);

    }
}
