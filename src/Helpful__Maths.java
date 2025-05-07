import java.util.Scanner;

public class Helpful__Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String math = sc.next();
        char [] num = math.toCharArray();

        for( int i = 0; i<num.length;i+=2){
            for(int j = i+2; j<num.length; j+=2){
                if(num[i]>num[j]){
                    char temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for(int i = 0; i<math.length();i++){
            System.out.print(num[i]);
        }
    }
}
