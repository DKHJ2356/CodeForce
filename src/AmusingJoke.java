import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String guestName = input.next();
        String residenceHost = input.next();
        String pile = input.next();
        int flag = 0;

        int[] array1 = new int[200];
        int[] array2 = new int[200];

        if(guestName.length()<=100 && residenceHost.length()<=100 && pile.length()<=100){
            for(int i = 0 ; i<guestName.length(); i++){
                int slot1 = guestName.charAt(i);
                array1[slot1]++;
            }
            for(int j = 0; j<residenceHost.length(); j++){
                int slot2 = residenceHost.charAt(j);
                array1[slot2]++;
            }
            for(int k = 0; k<pile.length();k++){
                int slot3 = pile.charAt(k);
                array2[slot3]++;
            }

            int i = 0;

            while(i<200){
                if(array1[i] == array2[i]) i++;
                else
                {
                    System.out.println("NO");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) System.out.println("YES");
        }
    }
}
