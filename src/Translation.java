import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        int flag = 0;

        if(s.length() != t.length()) System.out.println("NO");
        else{

            for(int i =0 ; i<t.length(); i++){

                for(int j = t.length()-1; j>=0;j--){
                    if(s.charAt(i)!=t.charAt(j)) flag = 1;
                    i++;
                }

                break;
            }
            if(flag == 1) System.out.println("NO");
            else System.out.println("YES");
        }


    }
}
